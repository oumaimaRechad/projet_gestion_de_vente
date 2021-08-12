package com.projet.j2ee.struts.controller;

import java.util.List;

import javax.persistence.Basic;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.service.g_vente.ClientService;

public class ClientAction {
	@Autowired
	ClientService clientService;
	List<Client> clients;
	private Client client;
	private int idClt;
	private String  contact;
   private String nomClt;

   public List<Client> getClients() {
	return clients;
}

public void setClients(List<Client> clients) {
	this.clients = clients;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

private String   adreessClt;
	
   public int getIdClt() {
	return idClt;
	
}
  public String add() {
		
	  clients=clientService.getAllClient();
	   client= new Client(nomClt, adreessClt, contact);
	   clientService.saveClient(client);
		  clients=clientService.getAllClient();
	   
		return "success";

	}
  public String update() {
		
	  clients=clientService.getAllClient();
	   client=clientService.updateClient(idClt);
	   client.setAdreessClt(adreessClt);
	   client.setNomClt(nomClt);
	   client.setIdClt(idClt);
	   client.setContact(contact);
	   clientService.saveClient(client);
		  clients=clientService.getAllClient();
	   
		return "success";

	}
   
public void setIdClt(int idClt) {
	this.idClt = idClt;
}

public String getNomClt() {
	return nomClt;
}

public void setNomClt(String nomClt) {
	this.nomClt = nomClt;
}

public String getAdreessClt() {
	return adreessClt;
}

public void setAdreessClt(String adreessClt) {
	this.adreessClt = adreessClt;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}



public String execute() {
	   clients=clientService.getAllClient();
	   
	   
	   
	  
	   
		return "success";
		
		
		
	}
}
