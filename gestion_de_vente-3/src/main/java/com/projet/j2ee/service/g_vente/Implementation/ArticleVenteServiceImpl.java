package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.repos.g_vente.ArticleVenteRepository;
import com.projet.j2ee.service.g_vente.ArticleVenteService;


@Service
@Transactional
public class ArticleVenteServiceImpl implements ArticleVenteService {
	@Autowired
	ArticleVenteRepository ArticleVenteRepository;
	@Override
	public ArticleVente saveArticleVente(ArticleVente ar) {
		// TODO Auto-generated method stub
		return ArticleVenteRepository.save(ar);
	}

	@Override
	public ArticleVente updateArticleVente(ArticleVente ar) {
		// TODO Auto-generated method stub
		return ArticleVenteRepository.save(ar);
	}

	@Override
	public void deleteArticleVente(ArticleVente ar) {
		// TODO Auto-generated method stub
		ArticleVenteRepository.delete(ar);
	}

	@Override
	public void deleteArticleVenteById(int codeAr) {
		ArticleVenteRepository.deleteById(codeAr);
	}

	@Override
	public ArticleVente getArticleVente(int codeAr) {
		// TODO Auto-generated method stub
		return ArticleVenteRepository.findById(codeAr).get();
	}

	@Override
	public List<ArticleVente> getAllArticlesVente() {
		// TODO Auto-generated method stub
		return ArticleVenteRepository.findAll();
	}

}
