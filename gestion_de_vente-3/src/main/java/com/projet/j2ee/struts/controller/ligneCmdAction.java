package com.projet.j2ee.struts.controller;

import java.util.List;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projet.j2ee.models.g_vente.ArticleStock;
import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.models.g_vente.LigneCmd;
import com.projet.j2ee.service.g_vente.ArticleStockService;
import com.projet.j2ee.service.g_vente.ArticleVenteService;
import com.projet.j2ee.service.g_vente.CommandeService;
import com.projet.j2ee.service.g_vente.FactureService;
import com.projet.j2ee.service.g_vente.LigneCmdService;

@Component
public class ligneCmdAction extends DefaultActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	CommandeService commandeService;
	List<Commande> commandes;
	@Autowired
	ArticleVenteService articleService;
	 List<ArticleVente> articles;
	 @Autowired
	 LigneCmdService ligneCmdService;
	 List<LigneCmd> ligneCmds;
	 @Autowired
	 FactureService factureService;
	 Facture facture;
	 List <Facture> factures;
	 private int stock=0;
	 public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Autowired
		ArticleStockService StockService;
		 List<ArticleStock> articlesStock;
	 private int codeCmd;
	 private int codeArt;
	
		private Commande Cmd;
		 int qteCmd;
		private int codeLigneCmd;
		private ArticleVente art;
		LigneCmd ligneCmd;
	public int getCodeCmd() {
		return codeCmd;
	}
	public void setCodeCmd(int codeCmd) {
		this.codeCmd = codeCmd;
	}
	public int getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(int codeArt) {
		this.codeArt = codeArt;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public List<ArticleVente> getArticles() {
		return articles;
	}
	public void setArticles(List<ArticleVente> articles) {
		this.articles = articles;
	}
	
	 
	
	public LigneCmd getLigneCmd() {
		return ligneCmd;
	}
	public void setLigneCmd(LigneCmd ligneCmd) {
		this.ligneCmd = ligneCmd;
	}
	public List<LigneCmd> getLigneCmds() {
		return ligneCmds;
	}
	public void setLigneCmds(List<LigneCmd> ligneCmds) {
		this.ligneCmds = ligneCmds;
	}
	public Commande getCmd() {
		return Cmd;
	}
	public void setCmd(Commande cmd) {
		Cmd = cmd;
	}
	public int getQteCmd() {
		return qteCmd;
	}
	public void setQteCmd(int qteCmd) {
		this.qteCmd = qteCmd;
	}
	public int getCodeLigneCmd() {
		return codeLigneCmd;
	}
	public void setCodeLigneCmd(int codeLigneCmd) {
		this.codeLigneCmd = codeLigneCmd;
	}
	public ArticleVente getArt() {
		return art;
	}
	public void setArt(ArticleVente art) {
		this.art = art;
	}
	   public String add() {
		  
			ligneCmds = ligneCmdService.getAllLigneCmd();
		   articles=articleService.getAllArticlesVente();
	    	commandes = commandeService.getAllCommande();
	    	for (ArticleVente art:articles) {
	    		if (art.getCodeArt()== getCodeArt()) {
	    		stock=art.getQteArt();
	    	
	    	if (qteCmd <= art.getQteArt() ) {
	    	int total;
	    int res;
	    	setArt(articleService.getArticleVente(getCodeArt()));
	    	setCmd(commandeService.getCommande(getCodeCmd()));
	    	
	    	ligneCmd = new LigneCmd( art, Cmd, getQteCmd());
	    	ligneCmd=ligneCmdService.saveLigneCmd(ligneCmd);
	    	factures=factureService.getAllFacture();
	    	for (Facture fct:factures) {
	    		
	    		if (fct.getCmd().getCodeCmd()== ligneCmd.getCmd().getCodeCmd()) {
	    			res=ligneCmd.getArt().getPrixArt()*ligneCmd.getQteCmd();
	    			total=fct.getTotalFct()+res;
	    			fct.setTotalFct(total);
	    			
	    		
	    			
	    			factureService.saveFacture(fct);
	    			
	    		}
	    	}
	    	int n=art.getQteArt()-qteCmd;
	    	art.setQteArt(n);
	    	articleService.saveArticleVente(art);
	    	articlesStock=StockService.getAllArticlesStock();
	    	for (ArticleStock artS :articlesStock) {
	    		if(artS.getCodeArt() == codeArt)
	    		{
	    			artS.setQteStock(n);
	    			StockService.saveArticleStock(artS);
	    		}
	    	}
	    	ligneCmds = ligneCmdService.getAllLigneCmd();
			   articles=articleService.getAllArticlesVente();
		    	commandes = commandeService.getAllCommande();
		    	
		    	return "success";  }
	    		}
	    		
	    	
	    	
	    	
	    	}
	    	
	    	 return "input";
	    	
	    	
	    	
	    	    }
	   
	   public String test() throws Exception {
			ligneCmds = ligneCmdService.getAllLigneCmd();
			   articles=articleService.getAllArticlesVente();
		 	commandes = commandeService.getAllCommande();
		 	
			

		    return "success";
		}

public String execute() throws Exception {
	ligneCmds = ligneCmdService.getAllLigneCmd();
	   articles=articleService.getAllArticlesVente();
 	commandes = commandeService.getAllCommande();
 	
	

    return "success";
}
}