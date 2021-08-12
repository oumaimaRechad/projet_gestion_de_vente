package com.projet.j2ee.models.g_vente;

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
@Table(name="g_vente.reglement")

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Reglement {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeRglmt;
	private int totalTTC;
	private int montantApayer;
	private String modeReglements;
	@ManyToOne 
	private Client Clt;
	@ManyToOne 
	private Facture facture;
	public Reglement(Client clt, Facture facture, int totalTTC, int montantApayer, String modeReglements) {
		super();
		Clt = clt;
		this.facture = facture;
		this.totalTTC = totalTTC;
		this.montantApayer = montantApayer;
		this.modeReglements = modeReglements;
	}
	public Reglement(int codeRglmt, Client clt, Facture facture, int totalTTC, int montantApayer,
			String modeReglements) {
		super();
		this.codeRglmt = codeRglmt;
		Clt = clt;
		this.facture = facture;
		this.totalTTC = totalTTC;
		this.montantApayer = montantApayer;
		this.modeReglements = modeReglements;
	}
	public int getCodeRglmt() {
		return codeRglmt;
	}
	public void setCodeRglmt(int codeRglmt) {
		this.codeRglmt = codeRglmt;
	}
	public Client getClt() {
		return Clt;
	}
	public void setClt(Client clt) {
		Clt = clt;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public int getTotalTTC() {
		return totalTTC;
	}
	public void setTotalTTC(int totalTTC) {
		this.totalTTC = totalTTC;
	}
	public int getMontantApayer() {
		return montantApayer;
	}
	public void setMontantApayer(int montantApayer) {
		this.montantApayer = montantApayer;
	}
	public String getModeReglements() {
		return modeReglements;
	}
	public void setModeReglements(String modeReglements) {
		this.modeReglements = modeReglements;
	}
	
	
}
