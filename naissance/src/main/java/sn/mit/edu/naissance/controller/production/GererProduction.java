package sn.mit.edu.naissance.controller.production;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="gestion")
public class GererProduction {
	
		@RequestMapping(value="nouvelleActe", method = RequestMethod.GET)
		public String nouvelleProductionActe() {
			
			
			
			return "production/nouvelleActe";
		}
}
