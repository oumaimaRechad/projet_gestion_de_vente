package com.projet.j2ee.service.g_vente.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_vente.LigneCmd;
import com.projet.j2ee.repos.g_vente.LigneCmdRepository;
import com.projet.j2ee.service.g_vente.LigneCmdService;


@Service
public class LigneCmdServiceImpl implements LigneCmdService {
	@Autowired
	LigneCmdRepository ligneCmdRepos;
	
	
	@Override
	public LigneCmd saveLigneCmd(LigneCmd ligneCmd) {
		// TODO Auto-generated method stub
		return ligneCmdRepos.save(ligneCmd);
	}

	@Override
	public LigneCmd updateLigneCmd(LigneCmd ligneCmd) {
		// TODO Auto-generated method stub
		return ligneCmdRepos.save(ligneCmd);
	}

	@Override
	public void deleteLigneCmd(LigneCmd ligneCmd) {
		// TODO Auto-generated method stub
		ligneCmdRepos.delete(ligneCmd);
	}

	@Override
	public void deleteLigneCmdById(int codeLigneCmd) {
		// TODO Auto-generated method stub
		ligneCmdRepos.deleteById(codeLigneCmd);
	}

	@Override
	public LigneCmd getLigneCmd(int codeLigneCmd) {
		// TODO Auto-generated method stub
		return ligneCmdRepos.findById(codeLigneCmd).get();
	}

	@Override
	public List<LigneCmd> getAllLigneCmd() {
		// TODO Auto-generated method stub
		return ligneCmdRepos.findAll();
	}

}
