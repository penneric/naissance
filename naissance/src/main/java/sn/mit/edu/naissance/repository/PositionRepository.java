package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Position;

@Repository("positionRepository")
public interface PositionRepository extends JpaRepository<Position, Integer>{
	
	public Position findByPositionId(int positionId);
	public List<Position> findAll();
	public Position findByRang(String rang);
	
}
