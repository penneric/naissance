package sn.mit.edu.naissance.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Region")
public class Region {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="regionId",nullable=false,unique=true)
	private int regionId;
	
	@Column(name="nomRegion",unique=true)
	private String nomRegion;
	
//	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Departement> departement; 
//	 
	
	
	@OneToMany(mappedBy="region")
	private Set<Departement> departement;
	

	public int getRegionId() {
		return regionId;
	}


	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}


	public Set<Departement> getDepartement() {
		return departement;
	}


	public void setDepartement(Set<Departement> departement) {
		this.departement = departement;
	}


	public Region() {
		
	}


	public Region(int regionId, String nomRegion, Set<Departement> departement) {
		super();
		this.regionId = regionId;
		this.nomRegion = nomRegion;
		this.departement = departement;
	}


	



	
	
	
}
