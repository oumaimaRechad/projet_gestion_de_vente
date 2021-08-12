package com.projet.j2ee.models.g_vente;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="g_vente.articleStock")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ArticleStock {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeArt;
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	@Basic
	private String nomArt;
	@Basic
	private String descArt;
	@Basic
	private int qteStock;
	public ArticleStock(String nomArt, String descArt, int qteStock) {
		super();
		this.nomArt = nomArt;
		this.descArt = descArt;
		this.qteStock = qteStock;
	}
	public ArticleStock() {
		super();
	}
	public ArticleStock(int codeArt, String nomArt, String descArt, int qteStock) {
		super();
		this.codeArt = codeArt;
		this.nomArt = nomArt;
		this.descArt = descArt;
		this.qteStock = qteStock;
	}
	public int getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(int codeArt) {
		this.codeArt = codeArt;
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
	


	
	
	
	
}
