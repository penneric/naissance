package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.Roles;

public interface RoleService {
	
	List<Roles> findAll();
	Roles findByName (String name);
	Roles findByRolesId (long id);
	

}
