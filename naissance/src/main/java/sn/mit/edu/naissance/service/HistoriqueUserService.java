package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.HistoriqueUser;
import sn.mit.edu.naissance.entity.User;

public interface HistoriqueUserService {
	
	public void saveHistuser(HistoriqueUser historuser);
//	public List<HistoriqueUser> findbyUser(User users);
	
	public void delete(HistoriqueUser historuser);

}
