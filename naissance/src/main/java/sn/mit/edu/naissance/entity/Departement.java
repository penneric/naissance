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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Departement")
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departId",nullable=false,unique=true)
	private int departId;
	
	@Column(name="nomDepart",unique=true)
	private String nomDepart;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="regionId")
	private Region region;
	
	@OneToMany(mappedBy="departement")
	private Set<Arrondissement> arrondissements;	

	
	
	
	
	public Set<Arrondissement> getArrondissements() {
		return arrondissements;
	}

	public void setArrondissements(Set<Arrondissement> arrondissements) {
		this.arrondissements = arrondissements;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getNomDepart() {
		return nomDepart;
	}

	public void setNomDepart(String nomDepart) {
		this.nomDepart = nomDepart;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}



//	@OneToMany(mappedBy = "departement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Arrondissement> arrondissement = new ArrayList<Arrondissement>();


	public Departement() {
		
	}

public Departement(int departId, String nomDepart, Region region, Set<Arrondissement> arrondissements) {
	super();
	this.departId = departId;
	this.nomDepart = nomDepart;
	this.region = region;
	this.arrondissements = arrondissements;
}




	

}
