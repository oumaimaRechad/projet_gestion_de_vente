package com.projet.j2ee.repos.g_vente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.models.g_vente.Reglement;

public interface ReglementRepository extends JpaRepository<Reglement, Integer> {

}
