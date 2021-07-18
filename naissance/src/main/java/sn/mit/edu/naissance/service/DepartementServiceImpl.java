package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.Departement;
import sn.mit.edu.naissance.repository.DepartementRepository;

@Service("departementService")
public class DepartementServiceImpl implements DepartementService {
	
	
	@Autowired
	private DepartementRepository departementRepository;
	@Override
	public Departement findByDepartId(int departId) {
		// TODO Auto-generated method stub
		return departementRepository.findByDepartId(departId);
	}

	@Override
	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return departementRepository.findAll();
	}

}
