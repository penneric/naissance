package sn.mit.edu.naissance.entity;



import java.util.Date;

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
@Table(name="Autorite")
public class Autorite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="autoriteId",nullable=false,unique=true)
	private int autoriteId;
	
	@Column(name="nomAutorite",unique=true)
	private String nomAutorite;
	
	@Column(name="rangAutorite",unique=true)
	private String rangAutorite;
	
	@Column(name="statueAutorite",unique=true)
	private String statueAutorite;
	
	@Column(name="signatureAutorite",unique=true)
	private String signatureAutorite;
	
	private Date debutDeService;
	
	public String getRangAutorite() {
		return rangAutorite;
	}

	public void setRangAutorite(String rangAutorite) {
		this.rangAutorite = rangAutorite;
	}

	public String getStatueAutorite() {
		return statueAutorite;
	}

	public void setStatueAutorite(String statueAutorite) {
		this.statueAutorite = statueAutorite;
	}

	public String getSignatureAutorite() {
		return signatureAutorite;
	}

	public void setSignatureAutorite(String signatureAutorite) {
		this.signatureAutorite = signatureAutorite;
	}



	private Date finDeService;
	
	
	public Date getDebutDeService() {
		return debutDeService;
	}

	public void setDebutDeService(Date debutDeService) {
		this.debutDeService = debutDeService;
	}

	public Date getFinDeService() {
		return finDeService;
	}

	public void setFinDeService(Date finDeService) {
		this.finDeService = finDeService;
	}

	public int getAutoriteId() {
		return autoriteId;
	}

	public void setAutoriteId(int autoriteId) {
		this.autoriteId = autoriteId;
	}

	public String getNomAutorite() {
		return nomAutorite;
	}

	public void setNomAutorite(String nomAutorite) {
		this.nomAutorite = nomAutorite;
	}


	
	public Autorite() {
		
	}

	public Autorite(int autoriteId, String nomAutorite, String rangAutorite, String statueAutorite,
			String signatureAutorite, Date debutDeService, Date finDeService) {
		super();
		this.autoriteId = autoriteId;
		this.nomAutorite = nomAutorite;
		this.rangAutorite = rangAutorite;
		this.statueAutorite = statueAutorite;
		this.signatureAutorite = signatureAutorite;
		this.debutDeService = debutDeService;
		this.finDeService = finDeService;
	}
	

}
