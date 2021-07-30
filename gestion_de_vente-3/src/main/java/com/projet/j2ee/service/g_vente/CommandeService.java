package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.Commande;

public interface CommandeService {
	Commande saveCommande(Commande cmd);
	Commande updateCommande(Commande cmd);
	void deleteCommande(Commande cmd);
	void deleteCommandeById(int codeCmd);
	Commande getCommande(int codeCmd);
	List<Commande> getAllCommande();
}
