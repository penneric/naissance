package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Institution;

@Repository("institutionRepository")
public interface InstitutionRepository extends JpaRepository <Institution, Integer> {
	
	public List<Institution> findAll();
	public Institution findByInstitutionId(int institutionId);
}
