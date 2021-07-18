package sn.mit.edu.naissance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="roles")
public class Roles {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rolesId",nullable=false,unique=true)
	private long rolesId;
	
	@Column(name="name",unique=true)
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	
	public long getRolesId() {
		return rolesId;
	}


	public void setRolesId(long rolesId) {
		this.rolesId = rolesId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Roles(long rolesId, String name, String description) {
	
		this.rolesId = rolesId;
		this.name = name;
		this.description = description;
	}
	
	
	public Roles() {
		
	}

}
