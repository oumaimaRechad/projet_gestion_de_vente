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
@Table(name="g_vente.article")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ArticleVente {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeArt;
	@Basic
	private String nomArt;
	@Basic
	private String descArt;

	@Basic
	private int prixArt;
	
	public ArticleVente(String nomArt, String descArt, int prixArt) {
		super();
		this.nomArt = nomArt;
		this.descArt = descArt;
		this.prixArt = prixArt;
	}
	public ArticleVente() {}
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

	public int getPrixArt() {
		return prixArt;
	}

	public void setPrixArt(int prixArt) {
		this.prixArt = prixArt;
	}

	
	
	
	
}
