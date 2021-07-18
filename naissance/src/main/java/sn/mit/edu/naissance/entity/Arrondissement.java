package sn.mit.edu.naissance.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Arrondissement")
public class Arrondissement {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="arrondId",nullable=false,unique=true)
	private int arrondId;
	
	@Column(name="nomArrond",unique=true)
	private String nomArrond;
	

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="depart_id")
	private Departement departement;
	

	//@OneToMany(mappedBy="arrondissement")
	//private List<Institution> institution = new ArrayList();
	
	@OneToMany(mappedBy="arrondissement")
	private Set<Institution> institution;
	
	

	
	public Set<Institution> getInstitution() {
		return institution;
	}

	public void setInstitution(Set<Institution> institution) {
		this.institution = institution;
	}

	public int getArrondId() {
		return arrondId;
	}

	public void setArrondId(int arrondId) {
		this.arrondId = arrondId;
	}

	public String getNomArrond() {
		return nomArrond;
	}

	public void setNomArrond(String nomArrond) {
		this.nomArrond = nomArrond;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	
	public Arrondissement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arrondissement(int arrondId, String nomArrond, Departement departement, Set<Institution> institution) {
		super();
		this.arrondId = arrondId;
		this.nomArrond = nomArrond;
		this.departement = departement;
		this.institution = institution;
	}

	

	
	
	
}
