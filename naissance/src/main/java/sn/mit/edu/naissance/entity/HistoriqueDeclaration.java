package sn.mit.edu.naissance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "HistoriqueDeclaration")
public class HistoriqueDeclaration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="historDeclarId",nullable=false,unique=true)
	private int historDeclarId; 
	
	@Column(name="action")
	private String action;
	
	
	private String operation;
	
	private Date dateEnregistre = new Date();
	

	
	@ManyToOne
	@JoinColumn(name="declar_id" ,nullable=false)
	private DeclarationNaissance declarationNaissance;

	public int getHistorDeclarId() {
		return historDeclarId;
	}

	public void setHistorDeclarId(int historDeclarId) {
		this.historDeclarId = historDeclarId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Date getDateEnregistre() {
		return dateEnregistre;
	}

	public void setDateEnregistre(Date dateEnregistre) {
		this.dateEnregistre = dateEnregistre;
	}

	public DeclarationNaissance getDeclarationNaissance() {
		return declarationNaissance;
	}

	public void setDeclarationNaissance(DeclarationNaissance declarationNaissance) {
		this.declarationNaissance = declarationNaissance;
	}

	public HistoriqueDeclaration(int historDeclarId, String action, String operation, Date dateEnregistre,
			DeclarationNaissance declarationNaissance) {
		super();
		this.historDeclarId = historDeclarId;
		this.action = action;
		this.operation = operation;
		this.dateEnregistre = dateEnregistre;
		this.declarationNaissance = declarationNaissance;
	}

	public HistoriqueDeclaration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HistoriqueDeclaration [historDeclarId=" + historDeclarId + ", action=" + action + ", operation="
				+ operation + ", dateEnregistre=" + dateEnregistre + ", declarationNaissance=" + declarationNaissance
				+ "]";
	}
	
	
	

}
