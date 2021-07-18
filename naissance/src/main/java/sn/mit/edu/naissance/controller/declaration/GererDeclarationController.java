package sn.mit.edu.naissance.controller.declaration;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sn.mit.edu.naissance.entity.DeclarationNaissance;
import sn.mit.edu.naissance.entity.HistoriqueDeclaration;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.forms.DeclarationNaissanceForm;
import sn.mit.edu.naissance.service.DeclarationNaissanceService;
import sn.mit.edu.naissance.service.HistoriqueDeclarationService;
import sn.mit.edu.naissance.service.MainService;
import sn.mit.edu.naissance.service.UserService;

@Controller
public class GererDeclarationController {
	
	@Autowired
	private DeclarationNaissanceService declarationNaissanceServices;
	
	@Autowired
	private UserService userServices;
	
	@Autowired
	private MainService mainServices;
	
	@Autowired
	private HistoriqueDeclarationService historiqueDeclarationServices;
	
	
	
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) throws Exception {
		binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
	    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	   
	}
	
	
	@RequestMapping(value="/nouvelleDeclaration", method=RequestMethod.GET)
	public String creerDeclation() {
		
		
		
		return "declaration/nouvelleDeclaration";
	}

	@RequestMapping(value="/enregistre/nouvelle/declaration", method=RequestMethod.POST)
	public String enregistreDeclaration(@ModelAttribute("DeclarationNaissanceForm") @Validated DeclarationNaissanceForm declarationNaissanceForm,
			BindingResult result, HttpServletRequest httpServletRequest, Model model) throws ParseException {
		
		DeclarationNaissance declareNaissance = declarationNaissanceForm.convertToDeclarationNaissance();
		User utilisateurConnecter = userServices.getLogedUser(httpServletRequest);
		HistoriqueDeclaration historDeclare = new HistoriqueDeclaration();
		
		
		declareNaissance.setDateNaissanceEnfant(mainServices.stringToDate(declarationNaissanceForm.getDobEnfant()));;
		declareNaissance.setDateNaissanceMere(mainServices.stringToDate(declarationNaissanceForm.getDobMere()));
		
		if (declarationNaissanceForm.getDobPere()!=null) {
			
			declareNaissance.setDateNaissancePere(mainServices.stringToDate(declarationNaissanceForm.getDobPere()));
		}
		
		declareNaissance.setDateSignAutoriteCompetent(mainServices.stringToDate(declarationNaissanceForm.getDateSignatureAutoriteCompetent()));
		declareNaissance.setUsers(utilisateurConnecter);
		declareNaissance.setStatueDeclaration("CREER");
		
		declarationNaissanceServices.saveDeclarNais(declareNaissance);
		
		historDeclare.setAction("DECLARATION CREER");
		historDeclare.setDeclarationNaissance(declareNaissance);
		historDeclare.setOperation(utilisateurConnecter.getUsername() + " à enregistrer une déclaratoin de naissance");
		historiqueDeclarationServices.saveHistDeclNai(historDeclare);
		
		
		
		model.addAttribute("declareNaissance", declareNaissance);
		
		
		
		return "declaration/confirmerDeclaration";
	}
	
	
	@RequestMapping(value="/enregistre/modifier/declaration", method=RequestMethod.POST)
	public String enregistreModNouDeclaration(@ModelAttribute("DeclarationNaissanceForm") @Validated DeclarationNaissanceForm declarationNaissanceForm,
			BindingResult result, HttpServletRequest httpServletRequest, Model model) throws ParseException {
		
		DeclarationNaissance declareNaissance = declarationNaissanceForm.convertToDeclarationNaissance();
		User utilisateurConnecter = userServices.getLogedUser(httpServletRequest);
		HistoriqueDeclaration historDeclare = new HistoriqueDeclaration();
		
		
		declareNaissance.setDateNaissanceEnfant(mainServices.stringToDate(declarationNaissanceForm.getDobEnfant()));;
		declareNaissance.setDateNaissanceMere(mainServices.stringToDate(declarationNaissanceForm.getDobMere()));
		declareNaissance.setDeclarId(declarationNaissanceForm.getDeclarId());
		
		if (declarationNaissanceForm.getDobPere()!=null) {
			
			declareNaissance.setDateNaissancePere(mainServices.stringToDate(declarationNaissanceForm.getDobPere()));
		}
		
		declareNaissance.setDateSignAutoriteCompetent(mainServices.stringToDate(declarationNaissanceForm.getDateSignatureAutoriteCompetent()));
		declareNaissance.setUsers(utilisateurConnecter);
		declareNaissance.setStatueDeclaration("MODIFIER");
		
		declarationNaissanceServices.saveDeclarNais(declareNaissance);
		
		historDeclare.setAction("DECLARATION MODIFIER");
		historDeclare.setDeclarationNaissance(declareNaissance);
		historDeclare.setOperation(utilisateurConnecter.getUsername() + " à modifier une déclaratoin de naissance");
		historiqueDeclarationServices.saveHistDeclNai(historDeclare);
		
		
		
		model.addAttribute("declareNaissance", declareNaissance);
		
		
		
		return "declaration/confirmerDeclaration";
	}
	
	
	
	
	
	@RequestMapping(value="/afficher/detail/declaration/naissance", method=RequestMethod.GET)
	public String afficherDetailDeclaration(HttpServletRequest httpRequest, @RequestParam(name="declarId", required=true) int declarId, Model model) {
		
		DeclarationNaissance declarerNais = declarationNaissanceServices.findByDeclarId(declarId);	
		
		
		model.addAttribute("declarerNais", declarerNais);
		
		return "declaration/detailDeclarerNaissance";
	}

	
	@RequestMapping(value="/afficher/historique/declaration/naissance", method=RequestMethod.GET)
	public String afficherHistoriqueDeclaration(HttpServletRequest httpRequest, @RequestParam(name="declarId", required=true) int declarId, Model model) {
		
	DeclarationNaissance declarerNais = declarationNaissanceServices.findByDeclarId(declarId);	
		
	List<HistoriqueDeclaration>	ttHistorDeclarerNais = declarerNais.getHistoriqueDeclarationNaissance();
	
	model.addAttribute("ttHistorDeclarerNais", ttHistorDeclarerNais);
		
		return "declaration/historiqueDeclareNaissance";
	}
	
	@RequestMapping(value="/modifier/declaration/naissance", method=RequestMethod.GET)
	public String modifierDeclaration(HttpServletRequest httpRequest, @RequestParam(name="declarId", required=true) int declarId, Model model) {
		
		DeclarationNaissance declarerNais = declarationNaissanceServices.findByDeclarId(declarId);	
		
		
		model.addAttribute("declarerNais", declarerNais);
		
		
		return "declaration/modifierNouvDeclaration";
	}
	
	

	@RequestMapping(value="/supprimer/declaration/naissance", method=RequestMethod.GET)
	@ResponseBody
	public String supprimerDeclaration(HttpServletRequest httpRequest, @RequestParam(name="declarId", required=true) int declarId, Model model) {
		
		
		DeclarationNaissance declarerNais = declarationNaissanceServices.findByDeclarId(declarId);	
		
			if (declarerNais.getStatueDeclaration().equals("VALIDER")) {
				
				//model.addAttribute("messageErreur", "Cette déclaration ne peut être supprimée");
				
				return "VALIDER";
//				
//				List<DeclarationNaissance> ttDeclarNais = declarationNaissanceServices.findAll();
//				
//				model.addAttribute("ttDeclarNais", ttDeclarNais);
//				return "declaration/gestDeclartion";
				
				
			}else {
				
				List<HistoriqueDeclaration> ttHistDecl =declarerNais.getHistoriqueDeclarationNaissance();
				
				for (HistoriqueDeclaration historique: ttHistDecl) {
					
					historiqueDeclarationServices.delete(historique);
				}
				declarationNaissanceServices.deleteDeclarNais(declarerNais);
				
				
				
//				List<DeclarationNaissance> ttDeclarNais = declarationNaissanceServices.findAll();			
//				model.addAttribute("ttDeclarNais", ttDeclarNais);		
//				return "declaration/gestDeclartion";
				return "OK";
			}
			
			
	//	return "déclation supprimée avec succès";

		
	}
	
	
	@RequestMapping(value="/valider/nouvelle/declaration", method=RequestMethod.GET)

	public String validerDeclaration(HttpServletRequest httpRequest, @RequestParam(name="declarId", required=true) int declarId, Model model) {
		
		User utilisateurConnecter = userServices.getLogedUser(httpRequest);
		HistoriqueDeclaration historDeclare = new HistoriqueDeclaration();
		DeclarationNaissance declarerNais = declarationNaissanceServices.findByDeclarId(declarId);	
		
		declarerNais.setStatueDeclaration("VALIDER");
		declarerNais.setDeclarId(declarId);
		declarerNais.setUsers(utilisateurConnecter);
		declarationNaissanceServices.updateDeclarNais(declarerNais);
		
		
		historDeclare.setAction("DECLARATION VALIDER");
		historDeclare.setDeclarationNaissance(declarerNais);
		historDeclare.setOperation(utilisateurConnecter.getUsername() + " à valider la déclaration de naissance");
		
		historiqueDeclarationServices.saveHistDeclNai(historDeclare);
		
		
		List<DeclarationNaissance> ttDeclarNais = declarationNaissanceServices.findAll();
		
		model.addAttribute("ttDeclarNais", ttDeclarNais);
			
		
		return "declaration/gestDeclartion";
	}
	
	
	
	
	
	
	
	
	
}
