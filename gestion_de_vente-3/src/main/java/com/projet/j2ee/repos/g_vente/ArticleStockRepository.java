package com.projet.j2ee.repos.g_vente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.g_vente.ArticleStock;


public interface ArticleStockRepository extends JpaRepository<ArticleStock, Integer> {

}
