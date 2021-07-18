package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Roles;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Roles, Integer>{
	
	List<Roles> findAll();
	Roles findByName (String name);
	Roles findByRolesId (long id);

	
}
