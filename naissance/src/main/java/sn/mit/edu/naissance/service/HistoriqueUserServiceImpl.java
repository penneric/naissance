package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.HistoriqueUser;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.repository.HistoriqueUserRepository;

@Service("historiqueUserService")
public class HistoriqueUserServiceImpl implements HistoriqueUserService {
	
	@Autowired
	private HistoriqueUserRepository historiqueUserRepository;

	@Override
	public void saveHistuser(HistoriqueUser historuser) {
		// TODO Auto-generated method stub
		
		historiqueUserRepository.save(historuser);
	}

	@Override
	public void delete(HistoriqueUser historuser) {
		
		historiqueUserRepository.delete(historuser);
		
	}




	

}
