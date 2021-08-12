package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.models.g_vente.LigneCmd;
import com.projet.j2ee.models.g_vente.Reglement;
import com.projet.j2ee.repos.g_vente.LigneCmdRepository;
import com.projet.j2ee.repos.g_vente.ReglementRepository;
import com.projet.j2ee.service.g_vente.LigneCmdService;
import com.projet.j2ee.service.g_vente.ReglementService;


@Service
public class ReglementServiceImpl implements ReglementService {
	@Autowired
	ReglementRepository reglementRepos;
	
	
	@Override
	public    Reglement saveReglement(Reglement rglmt) {
		// TODO Auto-generated method stub
		return reglementRepos.save(rglmt);
	}

	@Override
	public Reglement updateReglement(Reglement reglement) {
		// TODO Auto-generated method stub
		return reglementRepos.save(reglement);
	}

	@Override
	public void deleteReglement(Reglement reglement) {
		// TODO Auto-generated method stub
		reglementRepos.delete(reglement);
		
	}

	@Override
	public void deleteReglementById(int codeReglement) {
		// TODO Auto-generated method stub
		reglementRepos.deleteById(codeReglement);
	}

	@Override
	public Reglement getReglement(int codeRglmt) {
		// TODO Auto-generated method stub
		
		return reglementRepos.findById(codeRglmt).get();
	}

	@Override
	public List<Reglement> getAllReglements(){
		// TODO Auto-generated method stub
		return reglementRepos.findAll();
	}
	
	
}
