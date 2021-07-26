package sn.mit.edu.naissance.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.service.UserService;

@Controller

public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	
//	
//	@InitBinder
//    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
//	    final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//	    
//	}
//	

	@RequestMapping(value="/connecteSucces/pageA", method=RequestMethod.GET) 
	public String afficherPageAccueils(HttpServletRequest httpServletRequest, Model model){
		
		User utilisateurConnecter = userService.getLogedUser(httpServletRequest);
		Set <Roles> roles = utilisateurConnecter.getRoles();
		
		
		model.addAttribute("rolesUtilisateur", roles);
		model.addAttribute("usagerConnecter", utilisateurConnecter);
		
		return "/users/profile";
	}
	
	
	
	
	
	

}
