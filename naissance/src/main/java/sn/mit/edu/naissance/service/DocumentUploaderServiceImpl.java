package sn.mit.edu.naissance.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service("documentUploaderService")
public class DocumentUploaderServiceImpl implements DocumentUploaderService {
	
	
	@Value("${photo.folder}")
	private String dossierPhoto;
	
	@Value("${cni.declaration.file.folder}")
	private String dossierDeclaratoinCNI;
	
	@Autowired
	private Environment env;
	
	
	/*use to create location of folders
	*
	**/
	@PostConstruct
	public void init() {
		try {
			Files.createDirectories(Paths.get(dossierPhoto));
			Files.createDirectories(Paths.get(dossierDeclaratoinCNI));
			
		}catch (IOException e) {
			throw new RuntimeException("Impossible de créer un dossier de téléchargement !");
		}
	}
	

	@Override
	public void ecrireFileSurDisque(MultipartFile fichierTelecharge, String repertoire, String nomDocumentDBA){
		
		String fileOutputName = repertoire + nomDocumentDBA;
		System.out.println("fichier créé sur le disque"+fileOutputName);
		
		  try{  
			  init();
			  
		  byte barr[]=fichierTelecharge.getBytes();  
	        BufferedOutputStream bout=new BufferedOutputStream(  
	        		new FileOutputStream(nomDocumentDBA));
	        bout.write(barr);  
	        bout.flush();  
	        bout.close();  
	        }catch(Exception e){System.out.println(e);}

	}


	@Override
	public Resource telechargeFile(String repertoire, String nomDocumentDBA) {
		
		try {
			Path fichier = Paths.get(env.getProperty(repertoire)).resolve(nomDocumentDBA);
			Resource resource = new UrlResource(fichier.toUri());
			
			if (resource.exists() || resource.isReadable()) {
				return resource;
				
			}else {
				throw new RuntimeException("Impossible de lire le fichier !");
			}
		}catch(MalformedURLException e) {
			throw new RuntimeException("Erreur: " + e.getMessage());
		}
		
		
	}

}





