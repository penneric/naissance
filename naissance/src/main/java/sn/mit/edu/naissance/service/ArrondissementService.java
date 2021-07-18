package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.Arrondissement;

public interface ArrondissementService {
	Arrondissement findByArrondId(int arrondId);
	List<Arrondissement> findAll();

}
