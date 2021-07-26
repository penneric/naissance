package sn.mit.edu.naissance.forms;

import org.springframework.web.multipart.MultipartFile;

public class TelechargerFichierForm {
	
	private int id;
	private MultipartFile fichier;
	private String nomFichier;
	private String entite;
	private int numero;
	private String entiteID;
	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public MultipartFile getFichier() {
		return fichier;
	}


	public void setFichier(MultipartFile fichier) {
		this.fichier = fichier;
	}


	public String getNomFichier() {
		return nomFichier;
	}


	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}


	public String getEntite() {
		return entite;
	}


	public void setEntite(String entite) {
		this.entite = entite;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getEntiteID() {
		return entiteID;
	}


	public void setEntiteID(String entiteID) {
		this.entiteID = entiteID;
	}


	public TelechargerFichierForm() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TelechargerFichierForm(int id, MultipartFile fichier, String nomFichier, String entite, int numero,
			String entiteID) {
		super();
		this.id = id;
		this.fichier = fichier;
		this.nomFichier = nomFichier;
		this.entite = entite;
		this.numero = numero;
		this.entiteID = entiteID;
	}
	
	
	

	
	
}
