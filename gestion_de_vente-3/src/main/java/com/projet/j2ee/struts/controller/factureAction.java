package com.projet.j2ee.struts.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.models.g_vente.LigneCmd;
import com.projet.j2ee.service.g_vente.CommandeService;
import com.projet.j2ee.service.g_vente.FactureService;
import com.projet.j2ee.service.g_vente.LigneCmdService;

public class factureAction extends DefaultActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	FactureService factureService;
	@Autowired
	CommandeService CommandeService;
	@Autowired
	LigneCmdService ligneCmdService;
	List<Facture> factures;
	private int codeFct;
	private Commande cmd;
	private Facture facture;
	List<LigneCmd> ligneCmds;
	
	public List<LigneCmd> getLigneCmds() {
		return ligneCmds;
	}


	public void setLigneCmds(List<LigneCmd> ligneCmds) {
		this.ligneCmds = ligneCmds;
	}


	public List<ArticleVente> getArticles() {
		return articles;
	}


	public void setArticles(List<ArticleVente> articles) {
		this.articles = articles;
	}


	public List<Integer> getQuantiteCmd() {
		return QuantiteCmd;
	}


	public void setQuantiteCmd(List<Integer> quantiteCmd) {
		QuantiteCmd = quantiteCmd;
	}
	List<ArticleVente> articles=new ArrayList<ArticleVente>();
	List<Integer> QuantiteCmd=new ArrayList<Integer>();
	public Commande getCmd() {
		return cmd;
	}


	public void setCmd(Commande cmd) {
		this.cmd = cmd;
	}


	public Facture getFacture() {
		return facture;
	}


	public void setFacture(Facture facture) {
		this.facture = facture;
	}


	public int getCodeFct() {
		return codeFct;
	}


	public void setCodeFct(int codeFct) {
		this.codeFct = codeFct;
	}


	public List<Facture> getFactures() {
		return factures;
	}


	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

public String facture() {
	factures= factureService.getAllFacture();
	ligneCmds=ligneCmdService.getAllLigneCmd();
	facture =factureService.getFacture(getCodeFct());
	
	for (LigneCmd ligne:ligneCmds) {
		
		if (ligne.getCmd().getCodeCmd() == facture.getCmd().getCodeCmd()) {
			articles.add(ligne.getArt());
			QuantiteCmd.add(ligne.getQteCmd());
			
			
			
		}
	}
	getArticles();
	
	return "success";
	
}
public String facturee() {
	factures= factureService.getAllFacture();
	
	
	getArticles();
	
	return "success";
	
}
	public String execute() {
		
		
		
		
		
		factures= factureService.getAllFacture();
		
		
		 return "success";
		
		
		
		
		
	}
	
	
	
}
