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
@Table(name="HistoriqueDemande")
public class HistoriqueDemande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="historiqueDemandeId",nullable=false,unique=true)
	private int historiqueDemandeId; 
	
	@Column(name="action")
	private String action;
	
	private Date dateEnregistre = new Date();
	
	private String operation;
	

	@ManyToOne
	@JoinColumn(name="demande_id" ,nullable=false)
	private Demande demande;
	
	
	

	public int getHistoriqueDemandeId() {
		return historiqueDemandeId;
	}


	public void setHistoriqueDemandeId(int historiqueDemandeId) {
		this.historiqueDemandeId = historiqueDemandeId;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public Date getDateEnregistre() {
		return dateEnregistre;
	}


	public void setDateEnregistre(Date dateEnregistre) {
		this.dateEnregistre = dateEnregistre;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public Demande getDemande() {
		return demande;
	}


	public void setDemande(Demande demande) {
		this.demande = demande;
	}


	public HistoriqueDemande(int historiqueDemandeId, String action, Date dateEnregistre, String operation,
			Demande demande) {
		super();
		this.historiqueDemandeId = historiqueDemandeId;
		this.action = action;
		this.dateEnregistre = dateEnregistre;
		this.operation = operation;
		this.demande = demande;
	}


	public HistoriqueDemande() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "HistoriqueDemande [historiqueDemandeId=" + historiqueDemandeId + ", action=" + action
				+ ", dateEnregistre=" + dateEnregistre + ", operation=" + operation + ", demande=" + demande + "]";
	}


	

}
