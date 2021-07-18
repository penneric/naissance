package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.Institution;

public interface InstitutionService {
	
	public List<Institution> findAll();
	public Institution findByInstitutionId(int institutionId);
	
	

}
