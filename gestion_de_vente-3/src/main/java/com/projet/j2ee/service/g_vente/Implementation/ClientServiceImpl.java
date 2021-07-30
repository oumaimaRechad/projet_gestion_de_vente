package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.repos.g_vente.ClientRepository;
import com.projet.j2ee.service.g_vente.ClientService;
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientRepository;
	@Override
	public Client saveClient(Client clt) {
		
		return clientRepository.save(clt);
	}

	@Override
	public Client updateClient(Client clt) {
		// TODO Auto-generated method stub
		return clientRepository.save(clt);
	}

	@Override
	public void deleteClient(Client clt) {
		// TODO Auto-generated method stub
		clientRepository.delete(clt);
	}
	

	@Override
	public void deleteClientById(int idClt) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(idClt);
	}

	@Override
	public Client getClient(int idClt) {
		// TODO Auto-generated method stub
		return clientRepository.findById(idClt).get();
	}

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
