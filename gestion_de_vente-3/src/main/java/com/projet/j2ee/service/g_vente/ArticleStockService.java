package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.ArticleStock;


public interface ArticleStockService {
	ArticleStock saveArticleStock(ArticleStock ar);
	ArticleStock updateArticleStock(ArticleStock ar);
	void deleteArticleStock(ArticleStock ar);
	void deleteArticleStockById(int codeAr);
	ArticleStock getArticleStock(int codeAr);
	List<ArticleStock> getAllArticlesStock();
}
