package sn.mit.edu.naissance.controller.fileUploader;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.forms.TelechargerFichierForm;
import sn.mit.edu.naissance.service.DocumentUploaderService;
import sn.mit.edu.naissance.service.UserService;

@Controller
public class DocumentUploader {
	
	@Value("${photo.folder}")
	private String dossierPhoto;
	
	@Autowired
	private DocumentUploaderService documentUploaderServices;
	
	@Autowired UserService userServices;
	
	
@RequestMapping(value="/telecharge/fichier", method=RequestMethod.POST)
public String telechargeFichier(@ModelAttribute("telechargerFichierForm") 
		@Validated TelechargerFichierForm telechargerFichierForm, 
		BindingResult result, HttpSession session
        ,HttpServletRequest request, HttpServletResponse response,	Model model){
	
	System.out.println("*************************************");
	System.out.println(" am in the upload session");
	
	String nomFichier = telechargerFichierForm.getNomFichier();
//	String[] nomFichierArray = nomFichier.split("\\.");
//	String extension = nomFichierArray[nomFichierArray.length -1];
//	String nomFichierDBA = null;
	String entite = telechargerFichierForm.getEntite();
	String entiteId = telechargerFichierForm.getEntiteID();
	
	
	switch(entite) {
	case "PhotoUtilisateur":
		//Télechargement de la photo de l'utilisateur
		User user = userServices.findUserByUsersId(Integer.parseInt(entiteId));
		user.setPhoto(nomFichier);
		userServices.update(user);
		documentUploaderServices.ecrireFileSurDisque(telechargerFichierForm.getFichier(), dossierPhoto, dossierPhoto + nomFichier);
		break;
		
	case "":
			
				
			break;
		default:
			break;
			
	}
	
	return null;
	
	
}
	

}
