package com.projet.j2ee.struts.controller;

import java.util.List;

import javax.persistence.ManyToOne;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.models.g_vente.Reglement;
import com.projet.j2ee.service.g_vente.ClientService;
import com.projet.j2ee.service.g_vente.FactureService;
import com.projet.j2ee.service.g_vente.ReglementService;

public class ReglementAction extends DefaultActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	ReglementService reglementService;
	@Autowired
	ClientService clientService;
	List <Client> clients;
	@Autowired
	FactureService factureService;
	List <Facture> factures;
	List<Reglement> reglements;
private int idClt;
private int cltId;
public int getCltId() {
	return cltId;
}

public void setCltId(int cltId) {
	this.cltId = cltId;
}

private int codeFacture;
private   String reglmt;
	private int codeRglmt;
	private int totalTTC;
	private int montantApayer;
	private String modeReglements;
 private Reglement reglement;
	private Client Clt;
	 
	private Facture facture;

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<Reglement> getReglements() {
		return reglements;
	}

	public void setReglements(List<Reglement> reglements) {
		this.reglements = reglements;
	}

	public int getCodeRglmt() {
		return codeRglmt;
	}

	public void setCodeRglmt(int codeRglmt) {
		this.codeRglmt = codeRglmt;
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
	
    
	
	
	public int getIdClt() {
		return idClt;
	}

	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}

	public int getCodeFacture() {
		return codeFacture;
	}

	public void setCodeFacture(int codeFacture) {
		this.codeFacture = codeFacture;
	}

	public String getReglmt() {
		return reglmt;
	}

	public void setReglmt(String reglmt) {
		this.reglmt = reglmt;
	}

	
	public Reglement getReglement() {
		return reglement;
	}

	public void setReglement(Reglement reglement) {
		this.reglement = reglement;
	}
	public String execute() {
		clients = clientService.getAllClient();
    	
		  factures=factureService.getAllFacture();
		return "success";
	}

	
	public String add() {
		
clients = clientService.getAllClient();
    	
  factures=factureService.getAllFacture(); 
  
    	
    	 setClt(clientService.getClient(getCltId())); 
    	 setFacture(factureService.getFacture(getCodeFacture()));
    	 reglement=new Reglement(Clt, facture, totalTTC, montantApayer, modeReglements);
    	reglement=reglementService.saveReglement(reglement);
    	
    		
    		
    			facture.setTotalFct(totalTTC);
    			int res = totalTTC - montantApayer;
    			facture.setResteFct(res);
    			facture.setTotalFct(totalTTC);
    			facture.setModeRglt(modeReglements);
    			factureService.saveFacture(facture);
    			
    		
    			
    	
    	
		
		return "success";
	}
}
