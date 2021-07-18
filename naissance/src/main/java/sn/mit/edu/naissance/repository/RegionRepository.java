package sn.mit.edu.naissance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Departement;
import sn.mit.edu.naissance.entity.Region;

@Repository("regionRepository")
public interface RegionRepository extends JpaRepository <Region, Integer>{
	
	public Region findByRegionId(int regionId);
	public List<Region> findAll();
	
	//@Query(value = "SELECT d.depart_id, d.nom_depart FROM region r JOIN departement d WHERE d.region_id = :regionId",
	//@Query(value = "SELECT d.depart_id, d.region_id , d.nom_Depart FROM departement d WHERE d.region_id = :regionId",
	//		nativeQuery = true)
	public List<Departement> findDepartementByRegionId(Region region);
	
//	@Query(value = "SELECT d.depart_id, d.nom_depart FROM region r JOIN departement d WHERE d.region_id = :regionId",
//			nativeQuery = true)
//	
//	public List<Departement> findDepartementByRegionId(@Param("regionId") int regionId);

}
