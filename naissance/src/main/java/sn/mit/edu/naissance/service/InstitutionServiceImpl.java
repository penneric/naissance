package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.Institution;
import sn.mit.edu.naissance.repository.InstitutionRepository;

@Service("institutionService")
public class InstitutionServiceImpl implements InstitutionService {
	
	@Autowired
	private InstitutionRepository institutionRepository;
	

	@Override
	public List<Institution> findAll() {
		// TODO Auto-generated method stub
		return institutionRepository.findAll();
	}


	@Override
	public Institution findByInstitutionId(int institutionId) {
		// TODO Auto-generated method stub
		return institutionRepository.findByInstitutionId(institutionId);
	}



}
