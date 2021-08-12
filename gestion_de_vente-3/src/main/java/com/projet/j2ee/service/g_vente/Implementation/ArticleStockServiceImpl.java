package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.j2ee.models.g_vente.ArticleStock;

import com.projet.j2ee.service.g_vente.ArticleStockService;



@Service
@Transactional
public class ArticleStockServiceImpl implements ArticleStockService {
	@Autowired
	com.projet.j2ee.repos.g_vente.ArticleStockRepository ArticleStockRepository;
	@Override
	public ArticleStock saveArticleStock(ArticleStock ar) {
		// TODO Auto-generated method stub
		return ArticleStockRepository.save(ar);
	}

	@Override
	public ArticleStock updateArticleStock(ArticleStock ar) {
		// TODO Auto-generated method stub
		
		
		
		return ArticleStockRepository.findById(ar.getCodeArt()).get();
	}

	@Override
	public void deleteArticleStock(ArticleStock ar) {
		// TODO Auto-generated method stub
		ArticleStockRepository.delete(ar);
	}

	@Override
	public void deleteArticleStockById(int codeAr) {
		ArticleStockRepository.deleteById(codeAr);
	}

	@Override
	public ArticleStock getArticleStock(int codeAr) {
		// TODO Auto-generated method stub
		return ArticleStockRepository.findById(codeAr).get();
	}

	@Override
	public List<ArticleStock>  getAllArticlesStock() {
		// TODO Auto-generated method stub
		return ArticleStockRepository.findAll();
	}

}
