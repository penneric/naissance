package sn.mit.edu.naissance.controller.person;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sn.mit.edu.naissance.entity.HistoriqueUser;
import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.service.HistoriqueUserService;
import sn.mit.edu.naissance.service.UserService;

@Controller
public class ModifierInfosUtilisateurBasicController {
	
	@Autowired
	private UserService userServices;
	
	@Autowired
	private HistoriqueUserService historiqueUserServices;
	
	
	
	@RequestMapping(value="/modifier/infos/basic/utilisateur", method=RequestMethod.GET)
	public String afficherProfileBasic(HttpServletRequest httpServletRequest, Model model) {
		
		User utilisateur = userServices.getLogedUser(httpServletRequest);
		Set <Roles> roles = utilisateur.getRoles();
		
		model.addAttribute("ttRoles", roles);
		model.addAttribute("utilisateur", utilisateur);
		
		return "users/modifierInfosBasic";
	}
	
	
	
	@RequestMapping(value="/enregistrer/infos/basic/utilisateur", method=RequestMethod.POST)
	public String enregistrerProfileBasic(HttpServletRequest httpServletRequest, Model model, 
			@RequestParam (name="usersId", required=true) int userId,
			@RequestParam (name="email", required=true) String email,
			@RequestParam (name="nomeroTelephone", required=true) String nomeroTelephone,
			@RequestParam (name="domicile", required=true) String domicile ) {
		
		User utilisateurConnecter = userServices.findUserByUsersId(userId);
		
		utilisateurConnecter.setEmail(email);
		utilisateurConnecter.setDomicile(domicile);
		utilisateurConnecter.setNomeroTelephone(nomeroTelephone);
		
		userServices.update(utilisateurConnecter);
		
		HistoriqueUser histor = new HistoriqueUser();
		
		histor.setAction("MODIFIER");
		histor.setHistorUserId(utilisateurConnecter.getUsersId());
		histor.setOperation(utilisateurConnecter.getUsername() + "à modifier ses parametre basic");
		historiqueUserServices.saveHistuser(histor);
		
		Set <Roles> roles = utilisateurConnecter.getRoles();
		
	//	System.out.println("------------am controller ------------");
		model.addAttribute("rolesUtilisateur", roles);
		model.addAttribute("usagerConnecter", utilisateurConnecter);
		
		return "/users/profile";
	}
	
	
	@RequestMapping(value="/modifier/mot/passe/utilisateur", method=RequestMethod.GET)
	public String afficherPageModifierMotDePasse(HttpServletRequest httpServletRequest, Model model) {
		
		User utilisateur = userServices.getLogedUser(httpServletRequest);
		
		model.addAttribute("utilisateur", utilisateur);
		
		return "users/nouveauPwd";
	}
	
	
	@RequestMapping(value="/enregistre/mot/passe/modifier/utilisateur", method=RequestMethod.POST)
	public String afficherPageAvecMotDePasseModifier(HttpServletRequest httpServletRequest, Model model,
			@RequestParam (name="current-password", required=true) String currentPassword,
			@RequestParam (name="new-password", required=true) String newPassword) {
		
		User utilisateur = userServices.getLogedUser(httpServletRequest);
		
		if (userServices.matche(currentPassword, utilisateur.getPassword())) {
			
			String nouveauPwd = userServices.encryptPassword(newPassword);
			
			utilisateur.setPassword(nouveauPwd);
			userServices.update(utilisateur);
			
			
			HistoriqueUser histor = new HistoriqueUser();
			
			histor.setAction("MODIFIER");
			histor.setHistorUserId(utilisateur.getUsersId());
			histor.setOperation(utilisateur.getUsername() + "à modifier son mot de passe");
			historiqueUserServices.saveHistuser(histor);
		}
		
		Set <Roles> roles = utilisateur.getRoles();
	//	System.out.println("___________am done with correction_________");
		
		model.addAttribute("rolesUtilisateur", roles);
		model.addAttribute("usagerConnecter", utilisateur);
		
		return "/users/profile";
	}
	
	
}
