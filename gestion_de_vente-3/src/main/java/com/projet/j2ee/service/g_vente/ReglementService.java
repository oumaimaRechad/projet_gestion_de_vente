package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.models.g_vente.Reglement;

public interface ReglementService {
       Reglement saveReglement(Reglement rglmt);
       Reglement updateReglement(Reglement rglmt);
	void deleteReglement(Reglement rglmt);
	void deleteReglementById(int codeRglmt);
	 Reglement getReglement(int codeRglmt);
	List< Reglement> getAllReglements();
}
