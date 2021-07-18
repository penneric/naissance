package sn.mit.edu.naissance.controller.person;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sn.mit.edu.naissance.entity.Arrondissement;
import sn.mit.edu.naissance.entity.DeclarationNaissance;
import sn.mit.edu.naissance.entity.Demande;
import sn.mit.edu.naissance.entity.Departement;
import sn.mit.edu.naissance.entity.HistoriqueUser;
import sn.mit.edu.naissance.entity.Institution;
import sn.mit.edu.naissance.entity.Position;
import sn.mit.edu.naissance.entity.Region;
import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.forms.RegistrationForm;
import sn.mit.edu.naissance.service.ArrondissementService;
import sn.mit.edu.naissance.service.DepartementService;
import sn.mit.edu.naissance.service.HistoriqueUserService;
import sn.mit.edu.naissance.service.InstitutionService;
import sn.mit.edu.naissance.service.MainService;
import sn.mit.edu.naissance.service.PositionService;
import sn.mit.edu.naissance.service.RegionService;
import sn.mit.edu.naissance.service.RoleService;
import sn.mit.edu.naissance.service.UserService;

@Controller
public class EnregPersonController {
	
	@Autowired
	private MainService mainServices;
	
	@Autowired
	private RoleService roleServices;
	
	@Autowired
	private HistoriqueUserService historiqueUserServices;
	
	@Autowired
	private UserService userServices;
	
	@Autowired
	private PositionService positionServices;
	
	@Autowired
	private RegionService regionServices;
	
	@Autowired
	private DepartementService departementServices;
	
	@Autowired
	private ArrondissementService arrondissementServices;
	
	@Autowired
	private InstitutionService institutionServices;
	
	@Autowired
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	@InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder ) throws Exception {
		binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
	    final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true)); 
	}
	
	
	
	@RequestMapping(value="/utilisateur/affiche",  method=RequestMethod.GET) 
	public String afficherToutUtilisateurs( Model model ){
		
		List<User> toutsUtilisateur = userServices.findAll();
		
		
		model.addAttribute("toutsUtilisateur", toutsUtilisateur);
		
		System.out.println(toutsUtilisateur);
	
		
		return "users/toutUser";
	}
	
	@RequestMapping(value="/utilisateur/creer", method=RequestMethod.GET) 
	public String afficherUtilisateurCreer( Model model){
 	
		
	List<Roles> toutRoles =  roleServices.findAll();
	List<Position> toutPosition = positionServices.findAll();
	List<Region> toutRegion = regionServices.findAll();
	
	model.addAttribute("toutRoles", toutRoles);
	model.addAttribute("toutPosition", toutPosition);
	model.addAttribute("toutRegion", toutRegion);
		
//		System.out.println("-------Roles-----------");
//		System.out.println(toutRoles);
		
		
		return "users/enregistreUser";
	}
	
	@RequestMapping(value="/utilisateur/enregistre", method=RequestMethod.POST) 
	public String afficherUtilisateurEnregistre(@ModelAttribute("RegistrationForm") @Validated RegistrationForm registrationForm,
			BindingResult result, HttpServletRequest httpServletRequest, Model model) throws ParseException{
 	
		
		
		User user = registrationForm.convertToUser();
		Set<Roles> userRoles = new HashSet<>();
		
		//System.out.println("-------Date----- " + registrationForm.getDob());
		
		
		if(registrationForm.getRoles() != null) {
	
			for(int i=0; i<registrationForm.getRoles().length; i++) {
				Roles roles = roleServices.findByRolesId(registrationForm.getRoles()[i]);
				
//				System.out.println("-------Roles  looping-----------");
//				System.out.println(registrationForm.getRoles()[i]);
				
				if(roles != null)
					userRoles.add(roles);
			}
			
			
			user.setDob(mainServices.stringToDate(registrationForm.getDob()));
			user.setPassword(registrationForm.getPword());
			user.setEmail(registrationForm.getEmail());
			user.setUsername(registrationForm.getUsername());
			user.setRoles(userRoles);
			
			userServices.saveUser(user);
			
//			System.out.println("-------user created-----------");
//			System.out.println(user);
		}
		
		User utilisateurConnecter = userServices.getLogedUser(httpServletRequest);
		HistoriqueUser historiqueUser= new HistoriqueUser();
		
		
		historiqueUser.setAction("CREER UTILISATEUR");
		historiqueUser.setOperation(utilisateurConnecter.getUsername() +"  a cree le compte de " + user.getUsername());
		historiqueUser.setUsers(user);
		historiqueUserServices.saveHistuser(historiqueUser);
		
		Set<Roles> ttRoles = user.getRoles();
		
		model.addAttribute("ttRoles", ttRoles);
		model.addAttribute("utilisateurCreer", user);
		
		
//		System.out.println(user);
//		System.out.println(registrationForm);
//		
		
		return "users/confirmerUtilisateur";
	}
	
	@RequestMapping(value="/afficher/page/utilisateurModifier", method=RequestMethod.GET)
	public String afficherModifierUtilisateur(@ModelAttribute("RegistrationForm") @Validated RegistrationForm registrationForm,
			HttpServletRequest httpRequest, @RequestParam (name="usersId", required=true) int userId, Model model) throws ParseException {

		 User utilisateur = userServices.findUserByUsersId(userId);

		List<Position> toutPosition = positionServices.findAll();
		List<Region> toutRegion = regionServices.findAll();
		List<Arrondissement> toutArrond = arrondissementServices.findAll();
		List<Departement> toutDepart = departementServices.findAll();
		Set<Roles> ttUsersRoles = utilisateur.getRoles();
		List<Roles> ttRoles = roleServices.findAll();
		List<Institution> toutInstit = institutionServices.findAll();
		
		
		model.addAttribute("toutInstit", toutInstit);
		model.addAttribute("toutDepart", toutDepart);
		model.addAttribute("toutArrond", toutArrond);
		model.addAttribute("toutPosition", toutPosition);
		model.addAttribute("toutRegion", toutRegion);
		model.addAttribute("utilisateur", utilisateur);
		model.addAttribute("ttUsersRoles", ttUsersRoles);
		model.addAttribute("ttRoles", ttRoles);
		
		
		
		return "users/modifierUtilisateur";
	}
	
	@RequestMapping(value="/utilisateur/modifier", method=RequestMethod.POST) 
	public String enregistreUtilisateurModifier(@ModelAttribute("RegistrationForm") @Validated RegistrationForm registrationForm,
			BindingResult result, HttpServletRequest httpServletRequest, Model model) throws ParseException{
		

		User userUpdate = userServices.findUserByUsersId(registrationForm.getusersId());
		Set<Roles> userRoles = new HashSet<>();
		
		//System.out.println("-------Date----- " + registrationForm.getDob());
		
		
		if(registrationForm.getRoles() != null) {
	
			for(int i=0; i<registrationForm.getRoles().length; i++) {
				Roles roles = roleServices.findByRolesId(registrationForm.getRoles()[i]);
				
//				System.out.println("-------Roles  looping-----------");
//				System.out.println(registrationForm.getRoles()[i]);
				
				if(roles != null)
					userRoles.add(roles);
			}
			
			
			userUpdate.setDob(mainServices.stringToDate(registrationForm.getDob()));
			//userUpdate.setPassword(registrationForm.getPword());
			userUpdate.setEmail(registrationForm.getEmail());
		//	userUpdate.setUsername(registrationForm.getUsername());
			userUpdate.setRoles(userRoles);
			//userUpdate.setUsersId(registrationForm.getusersId());
			
			userServices.update(userUpdate);
			
//			System.out.println("-------user created-----------");
//			System.out.println(user);
		}
		
		User utilisateurConnecter = userServices.getLogedUser(httpServletRequest);
		HistoriqueUser historiqueUser= new HistoriqueUser();
		
		
		historiqueUser.setAction("UTILISATEUR MODIFIER");
		historiqueUser.setOperation(utilisateurConnecter.getUsername() +"  a modifier le compte de " + userUpdate.getUsername());
		historiqueUser.setUsers(userUpdate);
		historiqueUserServices.saveHistuser(historiqueUser);
		
		Set<Roles> ttRoles = userUpdate.getRoles();
		
		model.addAttribute("ttRoles", ttRoles);
		model.addAttribute("utilisateurCreer", userUpdate);
		
		
//		System.out.println(user);
//		System.out.println(registrationForm);
//			
		return "users/confirmerUtilisateur";
	}
	
	@RequestMapping(value="/utilisateur/confirmer", method=RequestMethod.POST)
	public String confirmerUtilisateur(HttpServletRequest httpRequest, @RequestParam(name="usersId", required=true)int usersId, Model model){
		
		User userConfirmer = userServices.findUserByUsersId(usersId);
		HistoriqueUser histUser= new HistoriqueUser();
		User utilisateurConnecter = userServices.getLogedUser(httpRequest);
		
		histUser.setAction("UTILISATEUR CONFIRMER");
		histUser.setOperation(utilisateurConnecter.getUsername() + " a confirmer le compte de " + userConfirmer.getUsername());
		histUser.setUsers(userConfirmer);
		historiqueUserServices.saveHistuser(histUser);
		
		List<User> toutsUtilisateur = userServices.findAll();
		model.addAttribute("toutsUtilisateur", toutsUtilisateur);
		
		return  "users/toutUser";
	}
	
	@RequestMapping(value="/utilisateur/supprimer", method=RequestMethod.POST)
	@ResponseBody
	public String utilisateurSuprimer(HttpServletRequest httpRequest, @RequestParam(name="usersId", required=true)int usersId, Model model) {
		
		User user = userServices.findUserByUsersId(usersId);
		User utilisateurConnecter = userServices.getLogedUser(httpRequest);
		List<HistoriqueUser> userHist = user.getHistoriqueUser();
		Set<Roles> userRoles = user.getRoles();
		List<DeclarationNaissance> userDeclarNai = user.getDeclarNaiUtilisateur();
		List<Demande> userDemande = user.getDemandeUtilisateur();

		 if (userDemande.isEmpty() && userDeclarNai.isEmpty() && (user != utilisateurConnecter)) {
					 for (HistoriqueUser userH : userHist) { 
						 historiqueUserServices.delete(userH); 
					 } 
					 
					 userServices.deleteUser(user);
					 
					 return "OK";
		 }else {
			 
			 return "NOT OK"; 
		 }
		
	}

	@RequestMapping(value="/utilisateur/afficher/departements", method=RequestMethod.GET)
	public String listeDepartement(HttpServletRequest httpRequest, @RequestParam (name="regionId", required=true) int regionId, Model model){
		
		Region toutRegion =regionServices.findByRegionId(regionId);
		Set<Departement> ttDepartRegion = toutRegion.getDepartement();

		
		model.addAttribute("toutRegion", toutRegion);
		model.addAttribute("ttDepartRegion", ttDepartRegion);

//		System.out.println("-------ttDepartRegion-----------");
//		System.out.println(ttDepartRegion);

		return "users/departements";
	}

	
	
	@RequestMapping(value="/utilisateur/afficher/arrondissements", method=RequestMethod.GET)
	public String listeArrondissement(HttpServletRequest httpRequest, @RequestParam (name="departId", required=true) int departId, Model model){
		
		Departement toutDepartement = departementServices.findByDepartId(departId);
		Set<Arrondissement> toutArrond = toutDepartement.getArrondissements();
		
		model.addAttribute("toutArrond", toutArrond);
		//model.addAttribute("ttDepartement", toutDepartement);
		
//		System.out.println("-------ttArrondDepart-----------");
//		System.out.println(toutArrond);
		
		return "users/arrondissementsListe";
	}
	

	
	@RequestMapping(value="/utilisateur/afficher/institutions", method=RequestMethod.GET)
	public String listeInstitution(HttpServletRequest httpRequest, @RequestParam (name="arrondId", required=true) int arrondId, Model model){
		
		Arrondissement  arrondissements= arrondissementServices.findByArrondId(arrondId);
		Set<Institution> toutInstitut = arrondissements.getInstitution();
		
		model.addAttribute("toutInstitut", toutInstitut);
		return "users/listeInstitutions";
	}
	
	
	@RequestMapping(value="/utilisateur/afficher/localiteInstitution", method=RequestMethod.GET)
	public String afficherLocaliteInstitution(HttpServletRequest httpRequest, @RequestParam (name="institutionId", required=true) int institutionId, Model model){
		
		Institution  unInstitut= institutionServices.findByInstitutionId(institutionId);
		
		
		model.addAttribute("unInstitut", unInstitut);
		return "users/institution";
	}
	
	
	@RequestMapping(value="/afficher/detail/utilisateur", method=RequestMethod.GET)
	public String afficherDetailUtilisateur(HttpServletRequest httpRequest, @RequestParam (name="usersId", required=true) int userId, Model model) {
		
		User utilisateur = userServices.findUserByUsersId(userId);
		Set<Roles> ttRoles = utilisateur.getRoles();
		
		model.addAttribute("utilisateur", utilisateur);
		model.addAttribute("ttRoles", ttRoles);
		
		
		//System.out.println("ttRoles  ------Detail------" + utilisateur);
		
		return "users/detailUtilisateur";
	}
	
	
	@RequestMapping(value="/afficher/historique/utilisateur", method=RequestMethod.GET)
	public String afficherHistoriqueUtilisateur(HttpServletRequest httpRequest, @RequestParam (name="usersId", required=true) int userId, Model model) {
		
		User utilisateur = userServices.findUserByUsersId(userId);
		List<HistoriqueUser> ttHistorUtilisateur = utilisateur.getHistoriqueUser();
		
		
		model.addAttribute("ttHistorUtilisateur", ttHistorUtilisateur);
		return "users/historique";
	}
	
	
	@RequestMapping(value="/afficher/arron/utilisateur", method=RequestMethod.GET)
	public String afficherArron(){
		return "users/arrondissementsListe";
	}
	
	@RequestMapping(value="/afficher/instit/utilisateur", method=RequestMethod.GET)
	public String afficherInstit(){
		return "users/listeInstitutions";
		
	}
	
	@RequestMapping(value="/afficher/ville/instit/utilisateur", method=RequestMethod.GET)
	public String afficherVilleInstit(){
		return "users/institution";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
