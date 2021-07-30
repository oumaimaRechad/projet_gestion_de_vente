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

import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.service.g_vente.ClientService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/client")
@CrossOrigin
public class ClientRestController {

	@Autowired
	ClientService cltService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Client> getAllClients()
	{
		return cltService.getAllClient();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Client getClientById(@PathVariable("id") int id) {
		return cltService.getClient(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Client createClient(@RequestBody Client article) {
			return cltService.saveClient(article);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public Client updateClient(@RequestBody Client article) {
		return cltService.updateClient(article);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteClient(@PathVariable("id") int id)
	{
		cltService.deleteClientById(id);
	}
	
	
}
