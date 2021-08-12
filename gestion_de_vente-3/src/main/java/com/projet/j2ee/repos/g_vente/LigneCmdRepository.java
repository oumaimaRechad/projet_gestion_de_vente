package com.projet.j2ee.repos.g_vente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.models.g_vente.LigneCmd;

public interface LigneCmdRepository extends JpaRepository<LigneCmd, Integer> {
	
	
}
