package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;

import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.repos.g_vente.FactureRepository;
import com.projet.j2ee.service.g_vente.FactureService;

@Service
public class FacteurServiceImpl implements FactureService {

	@Autowired
	FactureRepository facteurRepository;
	@Override
	public Facture saveFacture(Facture fct) {
		// TODO Auto-generated method stub
		return facteurRepository.save(fct);
	}

	@Override
	public Facture updateFacture(Facture fct) {
		// TODO Auto-generated method stub
		return facteurRepository.save(fct);
	}

	@Override
	public void deleteFacture(Facture fct) {
		// TODO Auto-generated method stub
		facteurRepository.delete(fct);
	}

	@Override
	public void deleteFactureById(int codeFct) {
		// TODO Auto-generated method stub
		facteurRepository.deleteById(codeFct);
	}

	@Override
	public Facture getFacture(int codeFct) {
		// TODO Auto-generated method stub
		return facteurRepository.findById(codeFct).get();
	}

	@Override
	public List<Facture> getAllFacture() {
		// TODO Auto-generated method stub
		return facteurRepository.findAll();
	}

}
