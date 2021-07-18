package sn.mit.edu.naissance.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Demande")
public class Demande {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="demandeId",nullable=false,unique=true)
	private int demandeId;
	
	@Column(name="typeDeTraitement",unique=true)
	private String typeDeTraitement;
	
		
	@Column(name="nomeroRefDemande",unique=true)
	private String nomeroRefDemande;
	
	@Column(name="statueDemande")
	private String statueDemande;
	
	@Column(name="dateEnregistrement")
	private Date dateEnregistrement;
	
	@Column(name="dateImpression")
	private Date dateImpression;
	
	
	private String statueMatrimoniale;
	
	private String refActeDeMariage;
	
	private Date dateDeMariage;
	
	private String refDocReconnaissanceEnfant;
	
	
	@ManyToOne
	@JoinColumn(name ="users_id")
	private User users;
	
	@ManyToOne
	@JoinColumn(name ="institution_id")
	private Institution institution;
	
	@ManyToOne
	@JoinColumn(name ="declar_id")
	private DeclarationNaissance declarationNaissance;
	
	@ManyToMany
	@JoinTable(
			name="demande_autorites",
			joinColumns = @JoinColumn (
					name ="demande_id", referencedColumnName="demandeId"), 
			inverseJoinColumns = @JoinColumn(
					name ="autorite_id", referencedColumnName="autoriteId"))
	
	private Set<Autorite> autorite ;	
	
	
	public int getDemandeId() {
		return demandeId;
	}

	public void setDemandeId(int demandeId) {
		this.demandeId = demandeId;
	}

	public String getTypeDeTraitement() {
		return typeDeTraitement;
	}

	public void setTypeDeTraitement(String typeDeTraitement) {
		this.typeDeTraitement = typeDeTraitement;
	}

	public String getNomeroRefDemande() {
		return nomeroRefDemande;
	}

	public void setNomeroRefDemande(String nomeroRefDemande) {
		this.nomeroRefDemande = nomeroRefDemande;
	}

	public String getStatueDemande() {
		return statueDemande;
	}

	public void setStatueDemande(String statueDemande) {
		this.statueDemande = statueDemande;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public Date getDateImpression() {
		return dateImpression;
	}

	public void setDateImpression(Date dateImpression) {
		this.dateImpression = dateImpression;
	}

	public String getStatueMatrimoniale() {
		return statueMatrimoniale;
	}

	public void setStatueMatrimoniale(String statueMatrimoniale) {
		this.statueMatrimoniale = statueMatrimoniale;
	}

	public String getRefActeDeMariage() {
		return refActeDeMariage;
	}

	public void setRefActeDeMariage(String refActeDeMariage) {
		this.refActeDeMariage = refActeDeMariage;
	}

	public Date getDateDeMariage() {
		return dateDeMariage;
	}

	public void setDateDeMariage(Date dateDeMariage) {
		this.dateDeMariage = dateDeMariage;
	}

	public String getRefDocReconnaissanceEnfant() {
		return refDocReconnaissanceEnfant;
	}

	public void setRefDocReconnaissanceEnfant(String refDocReconnaissanceEnfant) {
		this.refDocReconnaissanceEnfant = refDocReconnaissanceEnfant;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public DeclarationNaissance getDeclarationNaissance() {
		return declarationNaissance;
	}

	public void setDeclarationNaissance(DeclarationNaissance declarationNaissance) {
		this.declarationNaissance = declarationNaissance;
	}

	public Set<Autorite> getAutorite() {
		return autorite;
	}

	public void setAutorite(Set<Autorite> autorite) {
		this.autorite = autorite;
	}

	public Demande() {
		
		
	}

	public Demande(int demandeId, String typeDeTraitement, String nomeroRefDemande, String statueDemande,
			Date dateEnregistrement, Date dateImpression, String statueMatrimoniale, String refActeDeMariage,
			Date dateDeMariage, String refDocReconnaissanceEnfant, User users,
			DeclarationNaissance declarationNaissance, Set<Autorite> autorite) {
		super();
		this.demandeId = demandeId;
		this.typeDeTraitement = typeDeTraitement;
		this.nomeroRefDemande = nomeroRefDemande;
		this.statueDemande = statueDemande;
		this.dateEnregistrement = dateEnregistrement;
		this.dateImpression = dateImpression;
		this.statueMatrimoniale = statueMatrimoniale;
		this.refActeDeMariage = refActeDeMariage;
		this.dateDeMariage = dateDeMariage;
		this.refDocReconnaissanceEnfant = refDocReconnaissanceEnfant;
		this.users = users;
		this.declarationNaissance = declarationNaissance;
		this.autorite = autorite;
	}

	
	
}
