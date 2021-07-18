package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.Position;
import sn.mit.edu.naissance.repository.PositionRepository;

@Service("positionService")
public class PositionServiceImpl implements PositionService {
	
	@Autowired
	private PositionRepository positionRepository;
	


	@Override
	public List<Position> findAll() {
		// TODO Auto-generated method stub
		return positionRepository.findAll();
	}

	@Override
	public Position findByPositionId(int position_Id) {
		
		return positionRepository.findByPositionId(position_Id);
	}

	@Override
	public Position findByRang(String rang) {
		// TODO Auto-generated method stub
		return positionRepository.findByRang(rang);
	}

	

	
	
}
