package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.service.g_vente.ArticleVenteService;


@RestController
@EnableAutoConfiguration
@RequestMapping("/artVente")
@CrossOrigin

public class ArticleVenteRestController {
	@Autowired
	ArticleVenteService articleService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<ArticleVente> getAllArticles()
	{
		return articleService.getAllArticlesVente();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ArticleVente getArticleById(@PathVariable("id") int id) {
		return articleService.getArticleVente(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ArticleVente createArticle(@RequestBody ArticleVente article) {
			return articleService.saveArticleVente(article);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public ArticleVente updateArticle(@RequestBody int article) {
		return articleService.getArticleVente(article);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") int id)
	{
		articleService.deleteArticleVenteById(id);
	}
	
	
}
