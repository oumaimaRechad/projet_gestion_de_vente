package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.Facture;

public interface FactureService {
	Facture saveFacture(Facture fct);
	Facture updateFacture(Facture fct);
	void deleteFacture(Facture fct);
	void deleteFactureById(int codeFct);
	Facture getFacture(int codeFct);
	List<Facture> getAllFacture();
}
