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
@Table(name="g_vente.client")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Client {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	  private int idClt;
		@Basic
	   private String nomClt;
		@Basic
	   private String   adreessClt;
		@Basic
	   private String  contact;
   
   public Client(String nomClt, String adreessClt, String contact) {
		super();
		this.nomClt = nomClt;
		this.adreessClt = adreessClt;
		this.contact = contact;
	}
   public Client() {}
	public int getIdClt() {
		return idClt;
	}
	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}
	public String getNomClt() {
		return nomClt;
	}
	public void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}
	public String getAdreessClt() {
		return adreessClt;
	}
	public void setAdreessClt(String adreessClt) {
		this.adreessClt = adreessClt;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
   
   
   
   
   
   
}
