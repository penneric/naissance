package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.DeclarationNaissance;
import sn.mit.edu.naissance.repository.DeclarationNaissanceRepository;

@Service("DeclarationNaissanceService")
public class DeclarationNaissanceServiceImpl implements DeclarationNaissanceService {
	
	@Autowired
	private DeclarationNaissanceRepository declarationNaissanceRepository;

	@Override
	public List<DeclarationNaissance> findAll() {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.findAll();
	}

	@Override
	public DeclarationNaissance findByDeclarId(int declarId) {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.findByDeclarId(declarId);
	}

	@Override
	public DeclarationNaissance findByNomEnfantAndPrenomEnfant(String nomEnfant, String prenomEnfant) {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.findByNomEnfantAndPrenomEnfant(nomEnfant, prenomEnfant);
	}

	@Override
	public DeclarationNaissance findByNomeroRefDeclaration(String nomeroRefDeclaration) {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.findByNomeroRefDeclaration(nomeroRefDeclaration);
	}

	@Override
	public void saveDeclarNais(DeclarationNaissance declarationNaissance) {
		
		declarationNaissanceRepository.save(declarationNaissance);

	}

	@Override
	public void updateDeclarNais(DeclarationNaissance declarationNaissance) {
		declarationNaissanceRepository.save(declarationNaissance);

	}

	@Override
	public void deleteDeclarNais(DeclarationNaissance declarationNaissance) {
		declarationNaissanceRepository.delete(declarationNaissance);

	}

}
