package sn.mit.edu.naissance.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentUploaderService {
	
	
public void ecrireFileSurDisque(MultipartFile fileUploaded, String repertoire ,String nomDocumentDBA);
public Resource telechargeFile(String repertoire ,String nomDocumentDBA);

}
