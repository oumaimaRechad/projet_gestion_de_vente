package com.projet.j2ee.models.g_vente;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="g_vente.commande")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Commande {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeCmd;
	private int   qteCmd;
	private Date   dateCmd;
	private String  etatCmd;
	private String active;
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Commande(int codeCmd, int qteCmd, Date dateCmd, String etatCmd, String active, Client clt) {
		super();
		this.codeCmd = codeCmd;
		this.qteCmd = qteCmd;
		this.dateCmd = dateCmd;
		this.etatCmd = etatCmd;
		this.active = active;
		this.clt = clt;
	}
	@ManyToOne
	private Client  clt;
	public Commande(int qteCmd, Date dateCmd, String etatCmd, String active, Client clt) {
		super();
		this.qteCmd = qteCmd;
		this.dateCmd = dateCmd;
		this.etatCmd = etatCmd;
		this.active = active;
		this.clt = clt;
	}
	public Client getClt() {
		return clt;
	}
	public void setClt(Client clt) {
		this.clt = clt;
	}

	public Commande() {}
	public int getCodeCmd() {
		return codeCmd;
	}
	public void setCodeCmd(int codeCmd) {
		this.codeCmd = codeCmd;
	}
	public int getQteCmd() {
		return qteCmd;
	}
	public void setQteCmd(int qteCmd) {
		this.qteCmd = qteCmd;
	}
	public Date getDateCmd() {
		return dateCmd;
	}
	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	public String getEtatCmd() {
		return etatCmd;
	}
	public void setEtatCmd(String etatCmd) {
		this.etatCmd = etatCmd;
	}
	
	
	
}
