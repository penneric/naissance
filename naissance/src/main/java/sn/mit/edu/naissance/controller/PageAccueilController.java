package sn.mit.edu.naissance.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.service.UserService;


@Controller

public class PageAccueilController {
	
	@Autowired
	private UserService userService;
		
	@RequestMapping(value="/index") 
	public String afficherPageIndex(){
		
	
		return "index";
	}
	

	@PostMapping(value="/seConnecter") 
	public String pageLogin(){
		
		
		return "redirect:/connecteSucces";
	}
	
	@RequestMapping(value="/connecteSucces") 
	public String afficherPageAccueil(HttpServletRequest httpServletRequest, Model model){
		
		User utilisateurConnecter = userService.getLogedUser(httpServletRequest);
		Set <Roles> roles = utilisateurConnecter.getRoles();
		
	
		model.addAttribute("rolesUtilisateur", roles);
	
		model.addAttribute("usagerConnecter", utilisateurConnecter);
		
//		
//		System.out.println("------To home-----------");
//		System.out.println(utilisateurConnecter);
//		System.out.println("*************To HOME**************");
//		System.out.println(roles);
		
		return "home";
	}

}
