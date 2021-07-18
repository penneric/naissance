package sn.mit.edu.naissance.forms;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.service.MainService;
import sn.mit.edu.naissance.entity.Institution;
import sn.mit.edu.naissance.entity.Position;
import sn.mit.edu.naissance.entity.Region;

public class RegistrationForm {
	private int usersId;
	private String sname;
	private String gname;
	private String username;
	private String pword;
	private String pwdconf;
	private String dob;
	private String pob;
	private String nomeroTelephone;
	private String gendre;
	private String email;
	private Date isRegisterOn;
	private String photos;
	private String domicile;
	private Position position;
	//private String rang;
	private boolean IsEnable;
	private Institution institution;
	private List<Roles> RolesAsObject;
	private int [] roles;
	
	@Autowired
	private MainService mainService;
	
	
	private List<Region> regionAsObject;
	private List<Position> positionAsObject;

	public RegistrationForm() {
		super();
	}

	/**
	 * Convert Form to User entity
	 * @return
	 * @throws ParseException 
	 */

	public User convertToUser() throws ParseException {
		User user = new User();
		
		
		//user.setDob(mainService.stringToDate(dob));
		user.setGname(gname);
		user.setPob(pob);
		user.setSname(sname);
		user.setIsEnabled(IsEnable);
		user.setGendre(gendre);
		user.setDomicile(domicile);
		user.setNomeroTelephone(nomeroTelephone);
		user.setPhoto(photos);
		user.setUsersId(usersId);
		user.setDomicile(domicile);
		user.setEmail(email);
		user.setInstitution(institution);
		user.setPosition(position);
		
		

		return user;
	}
	
	/*
	 * Populate RegistrationForm from user entity
	 */
	public  RegistrationForm fromUser(User user) throws ParseException {
		
		RegistrationForm registrationForm = new RegistrationForm();
		
	
		registrationForm.setDob(user.getDob().toString());
		registrationForm.setIsEnable(user.getIsEnabled());
		registrationForm.setSname(user.getSname());
		registrationForm.setGname(user.getGname());
		registrationForm.setPword(user.getPassword());
		registrationForm.setPob(user.getPob());
		registrationForm.setNomeroTelephone(user.getNomeroTelephone());
		registrationForm.setGendre(user.getGendre());
		registrationForm.setEmail(user.getEmail());
		registrationForm.setIsRegisterOn(user.getIsRegisterOn());
		registrationForm.setPhotos(user.getPhoto());
		registrationForm.setDomicile(user.getDomicile());
		registrationForm.setPosition(user.getPosition());
		registrationForm.setInstitution(user.getInstitution());
		
		
		
		List<Roles> rolesObject = new ArrayList<Roles>();
		
		for (Roles rol: user.getRoles()) {
			
			rolesObject.add(rol);
		}
		
		
		//rolesObject.addAll(user.getRoles());
		registrationForm.setRolesAsObject(rolesObject);
		
		
		return registrationForm;
	}



	public int[] getRoles() {
		return roles;
	}

	public void setRoles(int[] roles) {
		this.roles = roles;
	}

	public int getusersId() {
		return usersId;
	}
	public void setusersId(int usersId) {
		this.usersId = usersId;
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
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getPwdconf() {
		return pwdconf;
	}
	public void setPwdconf(String pwdconf) {
		this.pwdconf = pwdconf;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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
	public Date getIsRegisterOn() {
		return isRegisterOn;
	}
	public void setIsRegisterOn(Date isRegisterOn) {
		this.isRegisterOn = isRegisterOn;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean isIsEnable() {
		return IsEnable;
	}
	public void setIsEnable(boolean isEnable) {
		IsEnable = isEnable;
	}
	public Institution getInstitution() {
		return institution;
	}
	public void setInstitution(Institution institution) {
		this.institution = institution;
	}
	public List<Region> getRegionAsObject() {
		return regionAsObject;
	}
	public void setRegionAsObject(List<Region> regionAsObject) {
		this.regionAsObject = regionAsObject;
	}
	public List<Position> getPositionAsObject() {
		return positionAsObject;
	}
	public void setPositionAsObject(List<Position> positionAsObject) {
		this.positionAsObject = positionAsObject;
	}
	public List<Roles> getRolesAsObject() {
		return RolesAsObject;
	}
	public void setRolesAsObject(List<Roles> RolesAsObject) {
		this.RolesAsObject = RolesAsObject;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public RegistrationForm(int usersId, String sname, String gname, String username, String pword, String pwdconf,
			String dob, String pob, String nomeroTelephone, String gendre, String email, Date isRegisterOn, String photos,
			String domicile, Position position,  boolean isEnable, Institution institution,
			List<Roles> RolesAsObject, int[] roles, List<Region> regionAsObject, List<Position> positionAsObject) {
		super();
		this.usersId = usersId;
		this.sname = sname;
		this.gname = gname;
		this.username = username;
		this.pword = pword;
		this.pwdconf = pwdconf;
		this.dob = dob;
		this.pob = pob;
		this.nomeroTelephone = nomeroTelephone;
		this.gendre = gendre;
		this.email = email;
		this.isRegisterOn = isRegisterOn;
		this.photos = photos;
		this.domicile = domicile;
		this.position = position;
		IsEnable = isEnable;
		this.institution = institution;
		this.RolesAsObject = RolesAsObject;
		this.roles = roles;
		this.regionAsObject = regionAsObject;
		this.positionAsObject = positionAsObject;
	}

	@Override
	public String toString() {
		return "RegistrationForm [usersId=" + usersId + ", sname=" + sname + ", gname=" + gname + ", username=" + username
				+ ", pword=" + pword + ", pwdconf=" + pwdconf + ", dob=" + dob + ", pob=" + pob + ", nomeroTelephone="
				+ nomeroTelephone + ", gendre=" + gendre + ", email=" + email + ", isRegisterOn=" + isRegisterOn
				+ ", photos=" + photos + ", domicile=" + domicile + ", position=" + position 
				+ ", IsEnable=" + IsEnable + ", institution=" + institution + ", RolesAsObject=" + RolesAsObject
				+ ", roles=" + Arrays.toString(roles) + ", regionAsObject=" + regionAsObject + ", positionAsObject="
				+ positionAsObject + "]";
	}

	
	
	
	
}
