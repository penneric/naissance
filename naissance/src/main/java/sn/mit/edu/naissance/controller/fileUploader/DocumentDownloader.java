package sn.mit.edu.naissance.controller.fileUploader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.servlet.ServletContext;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sn.mit.edu.naissance.service.DocumentUploaderService;

@Controller
public class DocumentDownloader {
	
	@Autowired
	private DocumentUploaderService documentUploaderServices;
	
	
	@Autowired
	private Environment env;
	
	@Autowired
    ServletContext context;
	
//	
//	
//		@RequestMapping(value="/download2")
//	    @ResponseBody
//	    public ResponseEntity<Resource> getFile(@RequestParam String filename) {
//	        Resource file = documentUploaderServices.telechargeFile(repertoire, filename);
//	        return ResponseEntity.ok()
//	                             .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
//	                             .body(file);        
//	}

	@RequestMapping(value="/download")
	public void telechargeDocument(@RequestParam String nomDocDBA,@RequestParam String repertoire,
							HttpServletResponse response) throws IOException{

		String realFolderName=env.getProperty(repertoire);
		try{  
		File file = new File(realFolderName+ nomDocDBA);
        response.setHeader("Content-Type", context.getMimeType(nomDocDBA));
        response.setHeader("Content-Length", String.valueOf(file.length()));
        response.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");    
        Files.copy(file.toPath(), response.getOutputStream());  
		}catch(Exception e){System.out.println(e);}
	}
}
