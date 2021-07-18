package sn.mit.edu.naissance.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ServiceUtileUser")
public class ServiceUtileUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serviceUtileUserId",nullable=false,unique=true)
	private int serviceUtileUserId;
	

	@Column(name="debutService")
	private Date debutService;
	@Column(name="finService")
	private Date finService;
	
	private String raisonChangement;
	
	

	
	
	
}
