package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.HistoriqueUser;
import sn.mit.edu.naissance.entity.User;



@Repository("HistoriqueUserRepository")
public interface HistoriqueUserRepository extends JpaRepository<HistoriqueUser, Integer> {
	
	
	public List<HistoriqueUser> findAll();
//	public List<HistoriqueUser> findbyUser(User users);
	public void delete(HistoriqueUser historuser);
	
	

}
