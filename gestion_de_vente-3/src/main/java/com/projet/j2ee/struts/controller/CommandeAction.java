package com.projet.j2ee.struts.controller;
import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.models.g_vente.LigneCmd;
import com.projet.j2ee.service.g_vente.ArticleVenteService;
import com.projet.j2ee.service.g_vente.ClientService;
import com.projet.j2ee.service.g_vente.CommandeService;
import com.projet.j2ee.service.g_vente.FactureService;
import com.projet.j2ee.service.g_vente.LigneCmdService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
 
@Component
public class CommandeAction extends DefaultActionSupport {
	private static final long serialVersionUID = 1L;
    
	@Autowired
	CommandeService commandeService;
	Commande commande;
	int idClt;

	List<Integer> cltId;
		private int   qteCmd;
		private Date   dateCmd;
		private String  etatCmd;
		private String active;
		private Client  clt;
		
	
		private int codeCmd;
	@Autowired
	FactureService factureService;
	Facture facture ;
	List<Facture> factures;
	private int codeFct;
	private Date dateFct;
	private int totalFct;
	private int remiseFct;
	private Commande Cmd;
	private String modeRglt;
	private int resteFct;
	@Autowired
	LigneCmdService ligneCmdService;
	List <LigneCmd> ligneCmds;
	
	public int getIdClt() {
		return idClt;
	}

	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	@Autowired
	ClientService    clientService;
	Client client;
	 List<Commande> commandes;
	 List<Client> clients;
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

		public List<Commande> getCommandes() {
			return commandes;
		}

		public void setCommandes(List<Commande> commandes) {
			this.commandes = commandes;
		}

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

		public String getActive() {
			return active;
		}

		public void setActive(String active) {
			this.active = active;
		}

		public Client getClt() {
			return clt;
		}

		public void setClt(Client clt) {
			this.clt = clt;
			
		}

	
    
		public String updateActive() throws Exception {
			clients = clientService.getAllClient();
	        commandes=commandeService.getAllCommande();
	    	
	    	clients = clientService.getAllClient();
			
			commande=new Commande();
			commande=commandeService.getCommande(getCodeCmd());
			if(commande.getActive().equals("active")) {
				commande.setActive("activer");
			}
			else
				commande.setActive("active");
	    	
	    	commandeService.saveCommande(commande);
	    	clients = clientService.getAllClient();
	        commandes=commandeService.getAllCommande();
	    	
	    	clients = clientService.getAllClient();
	        return "success";
	    }
   
public String updateEtat() throws Exception {
	
	clients = clientService.getAllClient();
    commandes=commandeService.getAllCommande();
	
	clients = clientService.getAllClient();
			commande=new Commande();
			commande=commandeService.getCommande(getCodeCmd());
			if(commande.getEtatCmd().equals("en_cours")) {
				commande.setEtatCmd("valide");
			}
			else
				commande.setEtatCmd("en_cours");
	    	
	    	commandeService.saveCommande(commande);
	    	clients = clientService.getAllClient();
	        commandes=commandeService.getAllCommande();
	    	
	    	clients = clientService.getAllClient();
	        return "success";
	    }
    public String execute() throws Exception {
    	
    	clients = clientService.getAllClient();
     commandes=commandeService.getAllCommande();
        return "success";
    }
    
    public String add()  {
    	clients = clientService.getAllClient();
        commandes=commandeService.getAllCommande();
    	int prix=0;
    	clients = clientService.getAllClient();
    	
    	setActive("active");
    	
    	 setClt(clientService.getClient(getIdClt())); 
    	commande =new Commande(getQteCmd(), getDateCmd(), getEtatCmd(), getActive(), clt);
    	commande=commandeService.saveCommande(commande);
    	setRemiseFct(0);
    	setModeRglt("-");
    	
    	
    	facture= new Facture(getDateCmd(), totalFct, getRemiseFct(), clt, getCommande(), modeRglt, resteFct);
    	 
    	factureService.saveFacture(facture);
    	clients = clientService.getAllClient();
        commandes=commandeService.getAllCommande();
    	
    	clients = clientService.getAllClient();
    	

		
    	        return "input";
    	        
    	    }
   
   
  
    
    public String fupdate()  {
    	
   	        return "success";
   	    }}