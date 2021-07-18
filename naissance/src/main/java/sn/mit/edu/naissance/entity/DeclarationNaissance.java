package sn.mit.edu.naissance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DeclarationNaissance")
public class DeclarationNaissance {
	



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="declarId",nullable=false,unique=true)
	private int declarId;
	
	@Column(name="nomPere")
	private String nomPere;
	
	@Column(name="lieuNaissancePere")
	private String lieuNaissancePere;
	
	@Column(name="dateNaissancePere")
	private Date dateNaissancePere;
	
	@Column(name="domicilePere")
	private String domicilePere;
	
	@Column(name="professionPere")
	private String professionPere;
	
	@Column(name="nationalitePere")
	private String nationalitePere;
	
	@Column(name="nomMere")
	private String nomMere;

	@Column(name="lieuNaissanceMere")
	private String lieuNaissanceMere;
	
	@Column(name="dateNaissanceMere")
	private Date dateNaissanceMere;
	
	@Column(name="domicileMere")
	private String domicileMere;
	
	@Column(name="professionMere")
	private String professionMere;
	
	@Column(name="nationaliteMere")
	private String nationaliteMere;
	
	@Column(name="docRefPere")
	private String docRefPere;

	@Column(name="docRefMere")
	private String docRefMere;
	
	@Column(name="nomeroRefDeclaration")
	private String nomeroRefDeclaration;

	@Column(name="nomAutoriteCompetent")
	private String nomAutoriteCompetent;
	
	@Column(name="nomEnfant")
	private String nomEnfant;
	
	@Column(name="prenomEnfant")
	private String prenomEnfant;
	
	@Column(name="lieuNaissanceEnfant")
	private String lieuNaissanceEnfant;
	
	@Column(name="dateNaissanceEnfant")
	private Date dateNaissanceEnfant;
	

	@Column(name="statueDeclaration")
	private String statueDeclaration; 
	
	private String gendreEnfant;
	
	private Date dateSignAutoriteCompetent;
	
	@ManyToOne
	@JoinColumn(name ="users_id")
	private User users;
	
	
	@OneToMany(mappedBy="declarationNaissance")
	private List<HistoriqueDeclaration> historiqueDeclarationNaissance = new ArrayList<HistoriqueDeclaration>(); 


	public List<HistoriqueDeclaration> getHistoriqueDeclarationNaissance() {
		return historiqueDeclarationNaissance;
	}


	public void setHistoriqueDeclarationNaissance(List<HistoriqueDeclaration> historiqueDeclarationNaissance) {
		this.historiqueDeclarationNaissance = historiqueDeclarationNaissance;
	}

	public String getGendreEnfant() {
		return gendreEnfant;
	}


	public void setGendreEnfant(String gendreEnfant) {
		this.gendreEnfant = gendreEnfant;
	}
	public int getDeclarId() {
		return declarId;
	}


	public Date getDateSignAutoriteCompetent() {
		return dateSignAutoriteCompetent;
	}


	public void setDateSignAutoriteCompetent(Date dateSignAutoriteCompetent) {
		this.dateSignAutoriteCompetent = dateSignAutoriteCompetent;
	}


	public void setDeclarId(int declarId) {
		this.declarId = declarId;
	}


	public String getNomPere() {
		return nomPere;
	}


	public void setNomPere(String nomPere) {
		this.nomPere = nomPere;
	}


	public String getLieuNaissancePere() {
		return lieuNaissancePere;
	}


	public void setLieuNaissancePere(String lieuNaissancePere) {
		this.lieuNaissancePere = lieuNaissancePere;
	}


	public Date getDateNaissancePere() {
		return dateNaissancePere;
	}


	public void setDateNaissancePere(Date dateNaissancePere) {
		this.dateNaissancePere = dateNaissancePere;
	}


	public String getDomicilePere() {
		return domicilePere;
	}


	public void setDomicilePere(String domicilePere) {
		this.domicilePere = domicilePere;
	}


	public String getProfessionPere() {
		return professionPere;
	}


	public void setProfessionPere(String professionPere) {
		this.professionPere = professionPere;
	}


	public String getNationalitePere() {
		return nationalitePere;
	}


	public void setNationalitePere(String nationalitePere) {
		this.nationalitePere = nationalitePere;
	}


	public String getNomMere() {
		return nomMere;
	}


	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}


	public String getLieuNaissanceMere() {
		return lieuNaissanceMere;
	}


	public void setLieuNaissanceMere(String lieuNaissanceMere) {
		this.lieuNaissanceMere = lieuNaissanceMere;
	}


	public Date getDateNaissanceMere() {
		return dateNaissanceMere;
	}


	public void setDateNaissanceMere(Date dateNaissanceMere) {
		this.dateNaissanceMere = dateNaissanceMere;
	}


	public String getDomicileMere() {
		return domicileMere;
	}


	public void setDomicileMere(String domicileMere) {
		this.domicileMere = domicileMere;
	}


	public String getProfessionMere() {
		return professionMere;
	}


	public void setProfessionMere(String professionMere) {
		this.professionMere = professionMere;
	}


	public String getNationaliteMere() {
		return nationaliteMere;
	}


	public void setNationaliteMere(String nationaliteMere) {
		this.nationaliteMere = nationaliteMere;
	}


	public String getDocRefPere() {
		return docRefPere;
	}


	public void setDocRefPere(String docRefPere) {
		this.docRefPere = docRefPere;
	}


	public String getDocRefMere() {
		return docRefMere;
	}


	public void setDocRefMere(String docRefMere) {
		this.docRefMere = docRefMere;
	}


	public String getNomeroRefDeclaration() {
		return nomeroRefDeclaration;
	}


	public void setNomeroRefDeclaration(String nomeroRefDeclaration) {
		this.nomeroRefDeclaration = nomeroRefDeclaration;
	}


	public String getNomAutoriteCompetent() {
		return nomAutoriteCompetent;
	}


	public void setNomAutoriteCompetent(String nomAutoriteCompetent) {
		this.nomAutoriteCompetent = nomAutoriteCompetent;
	}


	public String getNomEnfant() {
		return nomEnfant;
	}


	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}


	public String getPrenomEnfant() {
		return prenomEnfant;
	}


	public void setPrenomEnfant(String prenomEnfant) {
		this.prenomEnfant = prenomEnfant;
	}


	public String getLieuNaissanceEnfant() {
		return lieuNaissanceEnfant;
	}


	public void setLieuNaissanceEnfant(String lieuNaissanceEnfant) {
		this.lieuNaissanceEnfant = lieuNaissanceEnfant;
	}


	public Date getDateNaissanceEnfant() {
		return dateNaissanceEnfant;
	}


	public void setDateNaissanceEnfant(Date dateNaissanceEnfant) {
		this.dateNaissanceEnfant = dateNaissanceEnfant;
	}


	public String getStatueDeclaration() {
		return statueDeclaration;
	}


	public void setStatueDeclaration(String statueDeclaration) {
		this.statueDeclaration = statueDeclaration;
	}


	public User getUsers() {
		return users;
	}


	public void setUsers(User users) {
		this.users = users;
	}





	public DeclarationNaissance() {
		
		// TODO Auto-generated constructor stub
	}


	public DeclarationNaissance(int declarId, String nomPere, String lieuNaissancePere, Date dateNaissancePere,
			String domicilePere, String professionPere, String nationalitePere, String nomMere,
			String lieuNaissanceMere, Date dateNaissanceMere, String domicileMere, String professionMere,
			String nationaliteMere, String docRefPere, String docRefMere, String nomeroRefDeclaration,
			String nomAutoriteCompetent, String nomEnfant, String prenomEnfant, String lieuNaissanceEnfant,
			Date dateNaissanceEnfant, String statueDeclaration, String gendreEnfant, Date dateSignAutoriteCompetent,
			User users, List<HistoriqueDeclaration> historiqueDeclarationNaissance) {
		super();
		this.declarId = declarId;
		this.nomPere = nomPere;
		this.lieuNaissancePere = lieuNaissancePere;
		this.dateNaissancePere = dateNaissancePere;
		this.domicilePere = domicilePere;
		this.professionPere = professionPere;
		this.nationalitePere = nationalitePere;
		this.nomMere = nomMere;
		this.lieuNaissanceMere = lieuNaissanceMere;
		this.dateNaissanceMere = dateNaissanceMere;
		this.domicileMere = domicileMere;
		this.professionMere = professionMere;
		this.nationaliteMere = nationaliteMere;
		this.docRefPere = docRefPere;
		this.docRefMere = docRefMere;
		this.nomeroRefDeclaration = nomeroRefDeclaration;
		this.nomAutoriteCompetent = nomAutoriteCompetent;
		this.nomEnfant = nomEnfant;
		this.prenomEnfant = prenomEnfant;
		this.lieuNaissanceEnfant = lieuNaissanceEnfant;
		this.dateNaissanceEnfant = dateNaissanceEnfant;
		this.statueDeclaration = statueDeclaration;
		this.gendreEnfant = gendreEnfant;
		this.dateSignAutoriteCompetent = dateSignAutoriteCompetent;
		this.users = users;
		this.historiqueDeclarationNaissance = historiqueDeclarationNaissance;
	}


//	@Override
//	public String toString() {
//		return "DeclarationNaissance [declarId=" + declarId + ", nomPere=" + nomPere + ", lieuNaissancePere="
//				+ lieuNaissancePere + ", dateNaissancePere=" + dateNaissancePere + ", domicilePere=" + domicilePere
//				+ ", professionPere=" + professionPere + ", nationalitePere=" + nationalitePere + ", nomMere=" + nomMere
//				+ ", lieuNaissanceMere=" + lieuNaissanceMere + ", dateNaissanceMere=" + dateNaissanceMere
//				+ ", domicileMere=" + domicileMere + ", professionMere=" + professionMere + ", nationaliteMere="
//				+ nationaliteMere + ", docRefPere=" + docRefPere + ", docRefMere=" + docRefMere
//				+ ", nomeroRefDeclaration=" + nomeroRefDeclaration + ", nomAutoriteCompetent=" + nomAutoriteCompetent
//				+ ", nomEnfant=" + nomEnfant + ", prenomEnfant=" + prenomEnfant + ", lieuNaissanceEnfant="
//				+ lieuNaissanceEnfant + ", dateNaissanceEnfant=" + dateNaissanceEnfant + ", statueDeclaration="
//				+ statueDeclaration + ", gendreEnfant=" + gendreEnfant + ", dateSignAutoriteCompetent="
//				+ dateSignAutoriteCompetent + ", users=" + users + ", historiqueDeclarationNaissance="
//				+ historiqueDeclarationNaissance + "]";
//	}



	
	
	
	
	
	
	
	
	
	
	

}
