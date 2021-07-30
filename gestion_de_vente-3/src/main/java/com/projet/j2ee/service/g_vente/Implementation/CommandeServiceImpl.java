package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.repos.g_vente.CommandeRepository;
import com.projet.j2ee.service.g_vente.CommandeService;
@Service
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    CommandeRepository cmdRepository;
	@Override
	public Commande saveCommande(Commande cmd) {
		// TODO Auto-generated method stub
		return cmdRepository.save(cmd);
	}

	@Override
	public Commande updateCommande(Commande cmd) {
		// TODO Auto-generated method stub
		return cmdRepository.save(cmd);
	}

	@Override
	public void deleteCommande(Commande cmd) {
		// TODO Auto-generated method stub
		cmdRepository.delete(cmd);
	}

	@Override
	public void deleteCommandeById(int codeCmd) {
		// TODO Auto-generated method stub
		cmdRepository.deleteById(codeCmd);
	}

	@Override
	public Commande getCommande(int codeCmd) {
		// TODO Auto-generated method stub
		return cmdRepository.findById(codeCmd).get();
	}

	@Override
	public List<Commande> getAllCommande() {
		// TODO Auto-generated method stub
		return cmdRepository.findAll();
	}

}
