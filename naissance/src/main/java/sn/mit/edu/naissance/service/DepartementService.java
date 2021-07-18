package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.Departement;

public interface DepartementService {
	
	Departement findByDepartId(int departId);
	List<Departement> findAll();
	
	

}
