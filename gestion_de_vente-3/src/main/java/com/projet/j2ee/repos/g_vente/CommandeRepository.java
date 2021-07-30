package com.projet.j2ee.repos.g_vente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.g_vente.Commande;


public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
