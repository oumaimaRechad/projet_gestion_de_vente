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
@Table(name="g_vente.facture")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Facture {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeFct;
	private Date dateFct;
	private int totalFct;
	private int remiseFct;
	@ManyToOne
	private Client Clt;
	@ManyToOne 
	private Commande Cmd;
	private String modeRglt;
	private int resteFct;
	
	public Facture(Date dateFct, int totalFct, int remiseFct, Client clt, Commande cmd, String modeRglt, int resteFct) {
		super();
		this.dateFct = dateFct;
		this.totalFct = totalFct;
		this.remiseFct = remiseFct;
		Clt = clt;
		Cmd = cmd;
		this.modeRglt = modeRglt;
		this.resteFct = resteFct;
	}
	public Facture() {}
	public int getCodeFct() {
		return codeFct;
	}
	public void setCodeFct(int codeFct) {
		this.codeFct = codeFct;
	}
	public Date getDateFct() {
		return dateFct;
	}
	public void setDateFct(Date dateFct) {
		this.dateFct = dateFct;
	}
	public int getTotalFct() {
		return totalFct;
	}
	public void setTotalFct(int totalFct) {
		this.totalFct = totalFct;
	}
	public int getRemiseFct() {
		return remiseFct;
	}
	public void setRemiseFct(int remiseFct) {
		this.remiseFct = remiseFct;
	}
	public Client getClt() {
		return Clt;
	}
	public void setClt(Client clt) {
		Clt = clt;
	}
	public Commande getCmd() {
		return Cmd;
	}
	public void setCmd(Commande cmd) {
		Cmd = cmd;
	}
	public String getModeRglt() {
		return modeRglt;
	}
	public void setModeRglt(String modeRglt) {
		this.modeRglt = modeRglt;
	}
	public int getResteFct() {
		return resteFct;
	}
	public void setResteFct(int resteFct) {
		this.resteFct = resteFct;
	}
	

}
