package com.projet.j2ee.models.g_vente;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	private Client Clt;
	@ManyToOne 
	private Commande Cmd;
	public LigneCmd(Client clt, Commande cmd) {
		super();
		Clt = clt;
		Cmd = cmd;
	}
	
	public LigneCmd() {}

	public int getCodeLigneCmd() {
		return codeLigneCmd;
	}

	public void setCodeLigneCmd(int codeLigneCmd) {
		this.codeLigneCmd = codeLigneCmd;
	}

	public Client getClt() {
		return Clt;
	}

	public void setClt(Client clt) {
		Clt = clt;
	}

	public Commande getCmd() {
		return Cmd;
	}

	public void setCmd(Commande cmd) {
		Cmd = cmd;
	}
	

}