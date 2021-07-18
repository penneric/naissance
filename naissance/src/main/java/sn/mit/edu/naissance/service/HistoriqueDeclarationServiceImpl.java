package sn.mit.edu.naissance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.HistoriqueDeclaration;
import sn.mit.edu.naissance.repository.HistoriqueDeclarationRepository;

@Service("HistoriqueDeclarationService")
public class HistoriqueDeclarationServiceImpl implements HistoriqueDeclarationService {
	
//	@Override
//	public void delete(HistoriqueDeclaration historDecl) {
//		historiqueDeclarationRepository.delete(historDecl);
//		
//	}

	
	
	@Autowired
	private HistoriqueDeclarationRepository historiqueDeclarationRepository;

	@Override
	public void saveHistDeclNai(HistoriqueDeclaration histordeclaNai) {
	 
		historiqueDeclarationRepository.save(histordeclaNai);
	}

	@Override
	public void delete(HistoriqueDeclaration historique) {
		historiqueDeclarationRepository.delete(historique);
		
	}

}
