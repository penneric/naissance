package sn.mit.edu.naissance.controller.declaration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.mit.edu.naissance.entity.DeclarationNaissance;
import sn.mit.edu.naissance.service.DeclarationNaissanceService;

@Controller
public class AfficherDeclarationController {
	
	@Autowired
	private DeclarationNaissanceService declarationNaissanceServices;
	
	@RequestMapping(value="/gestion/declaration/naissance", method=RequestMethod.GET)
	public String afficherTouteDeclaration(Model model) {
		
		List<DeclarationNaissance> ttDeclarNais = declarationNaissanceServices.findAll();
		
		model.addAttribute("ttDeclarNais", ttDeclarNais);
		
		
//		System.out.println("+++++++++++++++++++++");
//		System.out.println(ttDeclarNais);
		
		return "declaration/gestDeclartion";
		
	}

}
