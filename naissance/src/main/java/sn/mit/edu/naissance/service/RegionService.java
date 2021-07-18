package sn.mit.edu.naissance.service;

import java.util.List;

import sn.mit.edu.naissance.entity.Departement;
import sn.mit.edu.naissance.entity.Region;

public interface RegionService {
	
	public Region findByRegionId(int regionId);
	public List<Region> findAll();
	public List<Departement> findDepartementByRegionId(Region region);
	

}
