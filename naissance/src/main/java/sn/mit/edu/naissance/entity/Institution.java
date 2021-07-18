package sn.mit.edu.naissance.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Institution")
public class Institution {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="institutionId",nullable=false,unique=true)
	private int institutionId;
	
	@Column(name="nomInstitution")
	private String nomInstitution;

	private String localite;	
	
	private String typeInstitution;	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="arrond_id")
	private Arrondissement arrondissement;
	
	
	
	public String getTypeInstitution() {
		return typeInstitution;
	}

	public void setTypeInstitution(String typeInstitution) {
		this.typeInstitution = typeInstitution;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public Arrondissement getArrondissement() {
		return arrondissement;
	}

	public void setArrondissement(Arrondissement arrondissement) {
		this.arrondissement = arrondissement;
	}

	
	

	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public String getNomInstitution() {
		return nomInstitution;
	}

	public void setNomInstitution(String nomInstitution) {
		this.nomInstitution = nomInstitution;
	}


	public Institution() {
		
	}

	public Institution(int institutionId, String nomInstitution, String localite, String typeInstitution,
			Arrondissement arrondissement) {
		super();
		this.institutionId = institutionId;
		this.nomInstitution = nomInstitution;
		this.localite = localite;
		this.typeInstitution = typeInstitution;
		this.arrondissement = arrondissement;
	}

	

	
	
}
