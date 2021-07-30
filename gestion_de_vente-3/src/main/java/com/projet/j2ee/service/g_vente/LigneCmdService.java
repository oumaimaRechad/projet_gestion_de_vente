package com.projet.j2ee.service.g_vente;

import java.util.List;

import com.projet.j2ee.models.g_vente.LigneCmd;

public interface LigneCmdService {
	LigneCmd saveLigneCmd(LigneCmd ligneCmd);
	LigneCmd updateLigneCmd(LigneCmd ligneCmd);
	void deleteLigneCmd(LigneCmd ligneCmd);
	void deleteLigneCmdById(int codeLigneCmd);
	LigneCmd getLigneCmd(int codeLigneCmd);
	List<LigneCmd> getAllLigneCmd();
}
