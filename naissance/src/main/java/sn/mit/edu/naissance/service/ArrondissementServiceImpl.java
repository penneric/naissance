package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.Arrondissement;
import sn.mit.edu.naissance.repository.ArrondissementRepository;

@Service("arrondissementService")
public class ArrondissementServiceImpl implements ArrondissementService {

	
	@Autowired
	private ArrondissementRepository arrondissementRepository;
	
	@Override
	public Arrondissement findByArrondId(int arrondId) {
		// TODO Auto-generated method stub
		return arrondissementRepository.findByArrondId(arrondId);
	}

	@Override
	public List<Arrondissement> findAll() {
		// TODO Auto-generated method stub
		return arrondissementRepository.findAll();
	}

}
