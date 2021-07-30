package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.ArticleVente;

public interface ArticleVenteService {
	ArticleVente saveArticleVente(ArticleVente ar);
	ArticleVente updateArticleVente(ArticleVente ar);
	void deleteArticleVente(ArticleVente ar);
	void deleteArticleVenteById(int codeAr);
	ArticleVente getArticleVente(int codeAr);
	List<ArticleVente> getAllArticlesVente();
}
