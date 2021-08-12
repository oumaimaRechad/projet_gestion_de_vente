package com.projet.j2ee.models.g_vente;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="g_vente.ligne_Cmd")

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class LigneCmd{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeLigneCmd;
	
	@ManyToOne
	private ArticleVente art;
	@ManyToOne 
	private Commande Cmd;
	 int qteCmd;
	public ArticleVente getArt() {
		return art;
	}

	public void setArt(ArticleVente art) {
		this.art = art;
	}

	
	public LigneCmd(ArticleVente art, Commande cmd, int qteCmd) {
		super();
		this.art = art;
		Cmd = cmd;
		this.qteCmd = qteCmd;
	}

	public LigneCmd(int codeLigneCmd, ArticleVente art, Commande cmd, int qteCmd) {
		super();
		this.codeLigneCmd = codeLigneCmd;
		this.art = art;
		Cmd = cmd;
		this.qteCmd = qteCmd;
	}


	
	
	public int getQteCmd() {
		return qteCmd;
	}

	public void setQteCmd(int qteCmd) {
		this.qteCmd = qteCmd;
	}

	public LigneCmd() {}

	public int getCodeLigneCmd() {
		return codeLigneCmd;
	}

	public void setCodeLigneCmd(int codeLigneCmd) {
		this.codeLigneCmd = codeLigneCmd;
	}

	

	public Commande getCmd() {
		return Cmd;
	}

	public void setCmd(Commande cmd) {
		Cmd = cmd;
	}
	

}