package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Departement;

@Repository("departementRepository")
public interface DepartementRepository extends JpaRepository<Departement, Integer> {
	
	Departement findByDepartId(int departId);
	List<Departement> findAll();
	

}
