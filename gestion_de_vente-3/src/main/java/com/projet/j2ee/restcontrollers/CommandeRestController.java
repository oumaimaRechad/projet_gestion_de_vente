package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.g_vente.Commande;
import com.projet.j2ee.service.g_vente.CommandeService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/commande")
@CrossOrigin
public class CommandeRestController {
	@Autowired
	CommandeService commService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<Commande> getAllCommandes()
	{
		return commService.getAllCommande();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Commande getCommandeById(@PathVariable("id") int id) {
		return commService.getCommande(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Commande createCommande(@RequestBody Commande cmd) {
			return commService.saveCommande(cmd);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public Commande updateCommande(@RequestBody Commande cmd) {
		return commService.updateCommande(cmd);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCommande(@PathVariable("id") int id)
	{
		commService.deleteCommandeById(id);
	}
	
	
}
