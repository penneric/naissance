package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.DeclarationNaissance;

@Repository("DeclarationNaissanceRepository")
public interface DeclarationNaissanceRepository extends JpaRepository<DeclarationNaissance, Integer> {
	
	public List<DeclarationNaissance> findAll();
	public DeclarationNaissance findByDeclarId(int declarId);
	public DeclarationNaissance findByNomEnfantAndPrenomEnfant(String nomEnfant, String prenomEnfant);
	public DeclarationNaissance findByNomeroRefDeclaration(String nomeroRefDeclaration);

}
