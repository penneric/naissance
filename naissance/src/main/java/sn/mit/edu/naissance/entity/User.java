package sn.mit.edu.naissance.entity;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usersId",nullable=false,unique=true)
	private int usersId;
	
	@Column(name="userName",unique=true)
	private String username;
	
	@Column(name= "password", nullable=false)
	private String password;
	
	@Column(name="isEnabled", nullable=false)
	private Boolean isEnabled;
	
	@Column(name="isRegisterOn", nullable=false)
    private Date isRegisterOn = new Date();
	
	@Column(name="nom")
	private String sname;
	
	@Column(name="prenoms")
	private String gname;
	
	@Column(name="dateNaissance")
	private Date dob;

	@Column(name="lieuNaissance")
	private String pob;
	
	@Column(name="nomeroTelephone")
	private String nomeroTelephone;
	
	@Column(name="gendre")
	private String gendre;
	
	@Column(name="email")
	private String email;
	
	@Column(name="domicile")
	private String domicile;
	
	@Column(name="photo")
	private String photo;
	
	
	@ManyToOne()
    @JoinColumn(name="institution_id")

	private Institution institution;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(
			name="user_roles",
			joinColumns = @JoinColumn (
					name ="user_id", referencedColumnName="usersId"), 
			inverseJoinColumns = @JoinColumn(
					name ="role_id", referencedColumnName="rolesId"))
	
	private Set<Roles> roles ;	
	
	@ManyToOne()
    @JoinColumn(name="position_id")
	private Position position;
	
	@OneToMany(mappedBy="users")
	private List<HistoriqueUser>  historiqueUser = new ArrayList<HistoriqueUser>(); 
	
	@OneToMany(mappedBy="users")
	private List<Demande> demandeUtilisateur = new ArrayList<Demande>();
	

	@OneToMany(mappedBy="users")
	private List<DeclarationNaissance> declarNaiUtilisateur = new ArrayList<DeclarationNaissance>();
	
	
	
	public List<Demande> getDemandeUtilisateur() {
		return demandeUtilisateur;
	}

	public void setDemandeUtilisateur(List<Demande> demandeUtilisateur) {
		this.demandeUtilisateur = demandeUtilisateur;
	}

	public List<DeclarationNaissance> getDeclarNaiUtilisateur() {
		return declarNaiUtilisateur;
	}

	public void setDeclarNaiUtilisateur(List<DeclarationNaissance> declarNaiUtilisateur) {
		this.declarNaiUtilisateur = declarNaiUtilisateur;
	}
	public List<HistoriqueUser> getHistoriqueUser() {
		return historiqueUser;
	}

	public void setHistoriqueUser(List<HistoriqueUser> historiqueUser) {
		this.historiqueUser = historiqueUser;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	
	
	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Date getIsRegisterOn() {
		return isRegisterOn;
	}

	public void setIsRegisterOn(Date isRegisterOn) {
		this.isRegisterOn = isRegisterOn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public String getNomeroTelephone() {
		return nomeroTelephone;
	}

	public void setNomeroTelephone(String nomeroTelephone) {
		this.nomeroTelephone = nomeroTelephone;
	}

	public String getGendre() {
		return gendre;
	}

	public void setGendre(String gendre) {
		this.gendre = gendre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

	public User() {
		
	}

	public User(int usersId, String username, String password, Boolean isEnabled, Date isRegisterOn, String sname,
			String gname, Date dob, String pob, String nomeroTelephone, String gendre, String email, String domicile,
			String photo, Institution institution, Set<Roles> roles, Position position,
			List<HistoriqueUser> historiqueUser, List<Demande> demandeUtilisateur,
			List<DeclarationNaissance> declarNaiUtilisateur) {
		super();
		this.usersId = usersId;
		this.username = username;
		this.password = password;
		this.isEnabled = isEnabled;
		this.isRegisterOn = isRegisterOn;
		this.sname = sname;
		this.gname = gname;
		this.dob = dob;
		this.pob = pob;
		this.nomeroTelephone = nomeroTelephone;
		this.gendre = gendre;
		this.email = email;
		this.domicile = domicile;
		this.photo = photo;
		this.institution = institution;
		this.roles = roles;
		this.position = position;
		this.historiqueUser = historiqueUser;
		this.demandeUtilisateur = demandeUtilisateur;
		this.declarNaiUtilisateur = declarNaiUtilisateur;
	}




	

	
	
	
}
