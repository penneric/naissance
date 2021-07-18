package sn.mit.edu.naissance.forms;

import sn.mit.edu.naissance.entity.DeclarationNaissance;
import sn.mit.edu.naissance.entity.User;

public class DeclarationNaissanceForm {
	
	private int declarId;
	private String snameEnfant;
	private String gnameEnfant;
	private String dobEnfant;
	private String pobEnfant;
	private String gendreEnfant;
	private String snameMere;
	private String profMere;
	private String dobMere;
	private String pobMere;
	private String domicileMere;
	private String nationaliteMere;
	private String docRefMere;
	private String snamePere;
	private String profPere;
	private String dobPere;
	private String pobPere;
	private String domicilePere;
	private String nationalitePere;
	private String docRefPere;
	private String nomeroRefDeclaration;
	private String nomAutoriteCompetent;
	private String dateSignatureAutoriteCompetent;
	private String statueDeclaration;
	private User user;
	
  public DeclarationNaissance convertToDeclarationNaissance() {
	  
	  DeclarationNaissance declareNaissance = new DeclarationNaissance();
	  
	  declareNaissance.setDeclarId(declarId);
	  declareNaissance.setNomEnfant(snameEnfant);
	  declareNaissance.setPrenomEnfant(gnameEnfant);
	  declareNaissance.setLieuNaissanceEnfant(pobEnfant);
	  declareNaissance.setGendreEnfant(gendreEnfant);
	  declareNaissance.setNomMere(snameMere);
	  declareNaissance.setProfessionMere(profMere);
	  declareNaissance.setLieuNaissanceMere(pobMere);
	  declareNaissance.setDomicileMere(domicileMere);
	  declareNaissance.setNationaliteMere(nationaliteMere);
	  declareNaissance.setDocRefMere(docRefMere);
	  declareNaissance.setNomPere(snamePere);
	  declareNaissance.setProfessionPere(profPere);
	  declareNaissance.setLieuNaissancePere(pobMere);
	  declareNaissance.setDomicilePere(domicilePere);
	  declareNaissance.setNationalitePere(nationalitePere);
	  declareNaissance.setDocRefPere(docRefPere);
	  declareNaissance.setNomeroRefDeclaration(nomeroRefDeclaration);
	  declareNaissance.setNomAutoriteCompetent(nomAutoriteCompetent);
   // declareNaissance.setStatueDeclaration(statueDeclaration);
   // declareNaissance.setDateSignAutoriteCompetent(dateSignatureAutoriteCompetent);
  //  declareNaissance.setUsers(user);
	  
	  
	  
	  
	  return declareNaissance;
  }
	
 public static DeclarationNaissanceForm convertToForm(DeclarationNaissance declareNaissance) {
	 
	 DeclarationNaissanceForm declareNaiForm =new DeclarationNaissanceForm();
	 
	 declareNaiForm.setDeclarId(declareNaissance.getDeclarId());
	 declareNaiForm.setSnameEnfant(declareNaissance.getNomEnfant().trim());
	 declareNaiForm.setGnameEnfant(declareNaissance.getGendreEnfant().trim());
	 declareNaiForm.setDobEnfant(declareNaissance.getDateNaissanceEnfant().toString());
	 declareNaiForm.setPobEnfant(declareNaissance.getLieuNaissanceEnfant().trim());
	 declareNaiForm.setGendreEnfant(declareNaissance.getGendreEnfant());
	 declareNaiForm.setSnameMere(declareNaissance.getNomMere().trim());
	 declareNaiForm.setProfMere(declareNaissance.getProfessionMere());
	 declareNaiForm.setDobMere(declareNaissance.getDateNaissanceMere().toString());
	 declareNaiForm.setPobMere(declareNaissance.getLieuNaissanceMere().trim());
	 declareNaiForm.setDomicileMere(declareNaissance.getDomicileMere());
	 declareNaiForm.setNationaliteMere(declareNaissance.getNationaliteMere());
	 declareNaiForm.setDocRefMere(declareNaissance.getDocRefMere());
	 declareNaiForm.setSnamePere(declareNaissance.getNomPere());
	 declareNaiForm.setProfPere(declareNaissance.getProfessionPere());
	 declareNaiForm.setDobPere(declareNaissance.getDateNaissancePere().toString());
	 declareNaiForm.setDomicilePere(declareNaissance.getDomicilePere());
	 declareNaiForm.setNationalitePere(declareNaissance.getNationalitePere());
	 declareNaiForm.setDocRefPere(declareNaissance.getDocRefPere());
	 declareNaiForm.setNomeroRefDeclaration(declareNaissance.getNomeroRefDeclaration());
	 declareNaiForm.setNomAutoriteCompetent(declareNaissance.getNomAutoriteCompetent());
	 declareNaiForm.setStatueDeclaration(declareNaissance.getStatueDeclaration());
	 declareNaiForm.setDateSignatureAutoriteCompetent(declareNaissance.getDateSignAutoriteCompetent().toString());
	 declareNaiForm.setUser(declareNaissance.getUsers());
	 
	 
	 
	 
	return declareNaiForm;
 }

public DeclarationNaissanceForm() {
	
}



public int getDeclarId() {
	return declarId;
}

public void setDeclarId(int declarId) {
	this.declarId = declarId;
}

public String getSnameEnfant() {
	return snameEnfant;
}

public void setSnameEnfant(String snameEnfant) {
	this.snameEnfant = snameEnfant;
}

public String getGnameEnfant() {
	return gnameEnfant;
}

public void setGnameEnfant(String gnameEnfant) {
	this.gnameEnfant = gnameEnfant;
}

public String getDobEnfant() {
	return dobEnfant;
}

public void setDobEnfant(String dobEnfant) {
	this.dobEnfant = dobEnfant;
}

public String getPobEnfant() {
	return pobEnfant;
}

public void setPobEnfant(String pobEnfant) {
	this.pobEnfant = pobEnfant;
}

public String getGendreEnfant() {
	return gendreEnfant;
}

public void setGendreEnfant(String gendreEnfant) {
	this.gendreEnfant = gendreEnfant;
}

public String getSnameMere() {
	return snameMere;
}

public void setSnameMere(String snameMere) {
	this.snameMere = snameMere;
}

public String getProfMere() {
	return profMere;
}

public void setProfMere(String profMere) {
	this.profMere = profMere;
}

public String getDobMere() {
	return dobMere;
}

public void setDobMere(String dobMere) {
	this.dobMere = dobMere;
}

public String getPobMere() {
	return pobMere;
}

public void setPobMere(String pobMere) {
	this.pobMere = pobMere;
}

public String getDomicileMere() {
	return domicileMere;
}

public void setDomicileMere(String domicileMere) {
	this.domicileMere = domicileMere;
}

public String getNationaliteMere() {
	return nationaliteMere;
}

public void setNationaliteMere(String nationaliteMere) {
	this.nationaliteMere = nationaliteMere;
}

public String getDocRefMere() {
	return docRefMere;
}

public void setDocRefMere(String docRefMere) {
	this.docRefMere = docRefMere;
}

public String getSnamePere() {
	return snamePere;
}

public void setSnamePere(String snamePere) {
	this.snamePere = snamePere;
}

public String getProfPere() {
	return profPere;
}

public void setProfPere(String profPere) {
	this.profPere = profPere;
}

public String getDobPere() {
	return dobPere;
}

public void setDobPere(String dobPere) {
	this.dobPere = dobPere;
}

public String getPobPere() {
	return pobPere;
}

public void setPobPere(String pobPere) {
	this.pobPere = pobPere;
}

public String getDomicilePere() {
	return domicilePere;
}

public void setDomicilePere(String domicilePere) {
	this.domicilePere = domicilePere;
}

public String getNationalitePere() {
	return nationalitePere;
}

public void setNationalitePere(String nationalitePere) {
	this.nationalitePere = nationalitePere;
}

public String getDocRefPere() {
	return docRefPere;
}

public void setDocRefPere(String docRefPere) {
	this.docRefPere = docRefPere;
}

public String getNomeroRefDeclaration() {
	return nomeroRefDeclaration;
}

public void setNomeroRefDeclaration(String nomeroRefDeclaration) {
	this.nomeroRefDeclaration = nomeroRefDeclaration;
}

public String getnomAutoriteCompetent() {
	return nomAutoriteCompetent;
}

public void setnomAutoriteCompetent(String nomAutoriteCompetent) {
	this.nomAutoriteCompetent = nomAutoriteCompetent;
}

public String getStatueDeclaration() {
	return statueDeclaration;
}

public void setStatueDeclaration(String statueDeclaration) {
	this.statueDeclaration = statueDeclaration;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String getNomAutoriteCompetent() {
	return nomAutoriteCompetent;
}

public void setNomAutoriteCompetent(String nomAutoriteCompetent) {
	this.nomAutoriteCompetent = nomAutoriteCompetent;
}

public String getDateSignatureAutoriteCompetent() {
	return dateSignatureAutoriteCompetent;
}

public void setDateSignatureAutoriteCompetent(String dateSignatureAutoriteCompetent) {
	this.dateSignatureAutoriteCompetent = dateSignatureAutoriteCompetent;
}

public DeclarationNaissanceForm(int declarId, String snameEnfant, String gnameEnfant, String dobEnfant,
		String pobEnfant, String gendreEnfant, String snameMere, String profMere, String dobMere, String pobMere,
		String domicileMere, String nationaliteMere, String docRefMere, String snamePere, String profPere,
		String dobPere, String pobPere, String domicilePere, String nationalitePere, String docRefPere,
		String nomeroRefDeclaration, String nomAutoriteCompetent, String dateSignatureAutoriteCompetent,
		String statueDeclaration, User user) {
	super();
	this.declarId = declarId;
	this.snameEnfant = snameEnfant;
	this.gnameEnfant = gnameEnfant;
	this.dobEnfant = dobEnfant;
	this.pobEnfant = pobEnfant;
	this.gendreEnfant = gendreEnfant;
	this.snameMere = snameMere;
	this.profMere = profMere;
	this.dobMere = dobMere;
	this.pobMere = pobMere;
	this.domicileMere = domicileMere;
	this.nationaliteMere = nationaliteMere;
	this.docRefMere = docRefMere;
	this.snamePere = snamePere;
	this.profPere = profPere;
	this.dobPere = dobPere;
	this.pobPere = pobPere;
	this.domicilePere = domicilePere;
	this.nationalitePere = nationalitePere;
	this.docRefPere = docRefPere;
	this.nomeroRefDeclaration = nomeroRefDeclaration;
	this.nomAutoriteCompetent = nomAutoriteCompetent;
	this.dateSignatureAutoriteCompetent = dateSignatureAutoriteCompetent;
	this.statueDeclaration = statueDeclaration;
	this.user = user;
}

@Override
public String toString() {
	return "DeclarationNaissanceForm [declarId=" + declarId + ", snameEnfant=" + snameEnfant + ", gnameEnfant="
			+ gnameEnfant + ", dobEnfant=" + dobEnfant + ", pobEnfant=" + pobEnfant + ", gendreEnfant=" + gendreEnfant
			+ ", snameMere=" + snameMere + ", profMere=" + profMere + ", dobMere=" + dobMere + ", pobMere=" + pobMere
			+ ", domicileMere=" + domicileMere + ", nationaliteMere=" + nationaliteMere + ", docRefMere=" + docRefMere
			+ ", snamePere=" + snamePere + ", profPere=" + profPere + ", dobPere=" + dobPere + ", pobPere=" + pobPere
			+ ", domicilePere=" + domicilePere + ", nationalitePere=" + nationalitePere + ", docRefPere=" + docRefPere
			+ ", nomeroRefDeclaration=" + nomeroRefDeclaration + ", nomAutoriteCompetent=" + nomAutoriteCompetent
			+ ", dateSignatureAutoriteCompetent=" + dateSignatureAutoriteCompetent + ", statueDeclaration="
			+ statueDeclaration + ", user=" + user + "]";
}


 
 
 
 
 
 
 
}
