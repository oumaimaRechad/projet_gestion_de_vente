package com.projet.j2ee.struts.controller;
import com.projet.j2ee.models.g_vente.ArticleStock;
import com.projet.j2ee.models.g_vente.ArticleVente;
import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.service.g_vente.ArticleStockService;
import com.projet.j2ee.service.g_vente.ArticleVenteService;
import java.util.List;



import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 


 
@Component
public class articleVenteAction extends DefaultActionSupport {
	@Autowired
	ArticleVenteService articleService;
	 List<ArticleVente> articles;
	 @Autowired
		ArticleStockService articleStockService;
		 List<ArticleStock> articlesStock;
	 public List<ArticleStock> getArticlesStock() {
			return articlesStock;
		}

		public void setArticlesStock(List<ArticleStock> articlesStock) {
			this.articlesStock = articlesStock;
		}

		public void setArticles(List<ArticleVente> articles) {
			this.articles = articles;
		}

	public List<ArticleVente> getArticles() {
			return articles;
		}

	private ArticleVente article;
	 
	
	 public ArticleVente getArticle() {
		return article;
	}

	public String getNomArt() {
		return nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}

	public String getDescArt() {
		return descArt;
	}

	public void setDescArt(String descArt) {
		this.descArt = descArt;
	}

	public int getPrixArt() {
		return prixArt;
	}

	public void setPrixArt(int prixArt) {
		this.prixArt = prixArt;
	}

		private int  codeArt;
		public int getCodeArt() {
			return codeArt;
		}

		public void setCodeArt(int codeArt) {
			this.codeArt = codeArt;
		}

		private String nomArt;
		
		private String descArt;

		
		private int prixArt;
	private static final long serialVersionUID = 1L;
    
  
   
    public String execute() throws Exception {
  articles= articleService.getAllArticlesVente();
  articlesStock=articleStockService.getAllArticlesStock();
  articles= articleService.getAllArticlesVente();
        return "success";
    }
    
    public String add()  {
    	articles= articleService.getAllArticlesVente();
    	 articlesStock=articleStockService.getAllArticlesStock();
    	 
    	 
    	 for (ArticleStock art:articlesStock) {
	    		
	    		if (art.getCodeArt()== codeArt) {
	    			
	    		article=new ArticleVente(art.getNomArt(), art.getDescArt(), art.getQteStock(), getPrixArt());
	    			 articleService.saveArticleVente(article);
	    		}
	    	}
    	 
    	 articles= articleService.getAllArticlesVente();
    	 
    	 
    	 
    	
    	 
    	
    	        return "success";
    	    }
    public String update()  {
    	
    	  
    		
    	// article=new  ArticleVente(getCodeArt(),getNomArt(),getDescArt(),getPrixArt());
    	
   	   article= articleService.updateArticleVente(article);
   
	article.setPrixArt(getPrixArt());
	articleService.saveArticleVente(article);
   	        return "success"; 
   	    }
   
    public void setArticle(ArticleVente article) {
		this.article = article;
	}
   
    
    public String fupdate()  {
    	
   	        return "success";
   	    } 
    
    
}