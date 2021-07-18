package sn.mit.edu.naissance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="HistoriqueUser")
public class HistoriqueUser {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="historUserId",nullable=false,unique=true)
	private int historUserId; 
	
	@Column(name="action")
	private String action;
	
	@Column(name="operation")
	private String operation;
	


	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}



	private Date dateEnregistre = new Date();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="users_id")
	private User users;


	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public int getHistorUserId() {
		return historUserId;
	}

	public void setHistorUserId(int historUserId) {
		this.historUserId = historUserId;
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



	public HistoriqueUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistoriqueUser(int historUserId, String action, String operation, Date dateEnregistre, User users) {
		super();
		this.historUserId = historUserId;
		this.action = action;
		this.operation = operation;
		this.dateEnregistre = dateEnregistre;
		this.users = users;
	}
	
	
}
