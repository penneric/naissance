package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.repository.RoleRepository;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Roles> findAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public Roles findByName(String name) {
		
		return roleRepository.findByName(name);
	}

	@Override
	public Roles findByRolesId(long id) {
		return roleRepository.findByRolesId(id);
	}
	
	
	

}
