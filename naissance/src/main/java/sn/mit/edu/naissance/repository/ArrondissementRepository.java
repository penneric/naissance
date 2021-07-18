package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Arrondissement;

@Repository("arrondissementRepository")
public interface ArrondissementRepository extends JpaRepository<Arrondissement, Integer> {
	
	Arrondissement findByArrondId(int arrondId);
	List<Arrondissement> findAll();
	
}
