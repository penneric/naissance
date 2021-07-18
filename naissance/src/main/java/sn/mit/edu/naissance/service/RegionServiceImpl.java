package sn.mit.edu.naissance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.Departement;
import sn.mit.edu.naissance.entity.Region;
import sn.mit.edu.naissance.repository.RegionRepository;

@Service("regionService")
public class RegionServiceImpl implements RegionService {
	
	@Autowired
	private RegionRepository regionRepository;

	@Override
	public Region findByRegionId(int regionId) {
		// TODO Auto-generated method stub
		return regionRepository.findByRegionId(regionId);
	}

	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return regionRepository.findAll();
	}

	@Override
	public List<Departement> findDepartementByRegionId(Region region) {
		// TODO Auto-generated method stub
		return regionRepository.findDepartementByRegionId(region);
	}

	


}
