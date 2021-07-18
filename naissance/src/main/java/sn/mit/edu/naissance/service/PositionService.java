package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.Position;

public interface PositionService {
	
	public List<Position> findAll();
	public Position findByPositionId(int position_Id);
	public Position findByRang(String rang);
	

}
