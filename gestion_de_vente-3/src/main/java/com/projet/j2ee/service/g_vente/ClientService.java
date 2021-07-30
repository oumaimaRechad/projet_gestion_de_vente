package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.Client;

public interface ClientService {
	Client saveClient(Client clt);
	Client updateClient(Client clt);
	void deleteClient(Client clt);
	void deleteClientById(int idClt);
	Client getClient(int idClt);
	List<Client> getAllClient();
}
