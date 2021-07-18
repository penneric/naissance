package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.HistoriqueDeclaration;

@Repository("HistoriqueDeclarationRepository")
public interface HistoriqueDeclarationRepository extends JpaRepository<HistoriqueDeclaration, Integer> {

	
	public List<HistoriqueDeclaration> findAll();
//	public void delete(HistoriqueDeclaration historDecl);
}
