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

import com.projet.j2ee.models.g_vente.Facture;
import com.projet.j2ee.service.g_vente.FactureService;



@RestController
@EnableAutoConfiguration
@RequestMapping("/facture")
@CrossOrigin
public class FactureRestController {
	@Autowired
	FactureService factService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<Facture> getAllFactures()
	{
		return factService.getAllFacture();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Facture getFactureById(@PathVariable("id") int id) {
		return factService.getFacture(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Facture createFacture(@RequestBody Facture fr) {
			return factService.saveFacture(fr);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public Facture updateFacture(@RequestBody Facture fr) {
		return factService.updateFacture(fr);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteFacture(@PathVariable("id") int id)
	{
		factService.deleteFactureById(id);
	}
	
	
}
