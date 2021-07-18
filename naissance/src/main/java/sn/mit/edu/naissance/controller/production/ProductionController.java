package sn.mit.edu.naissance.controller.production;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductionController {
	
	@RequestMapping(value="/acte/produire", method= RequestMethod.GET)
	public String afficherProduction () {
		
		
		return "production/gestProduction"; 
	}
}
