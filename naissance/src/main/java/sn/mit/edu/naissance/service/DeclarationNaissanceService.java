package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.DeclarationNaissance;

public interface DeclarationNaissanceService {
	
	public List<DeclarationNaissance> findAll();
	public DeclarationNaissance findByDeclarId(int declarId);
	public DeclarationNaissance findByNomEnfantAndPrenomEnfant(String nomEnfant, String prenomEnfant);
	public DeclarationNaissance findByNomeroRefDeclaration(String nomeroRefDeclaration);
	public void saveDeclarNais(DeclarationNaissance declarationNaissance);
	public void updateDeclarNais(DeclarationNaissance declarationNaissance);
	public void deleteDeclarNais(DeclarationNaissance declarationNaissance);


}
