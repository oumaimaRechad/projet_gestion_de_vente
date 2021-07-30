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

import com.projet.j2ee.models.g_vente.LigneCmd;
import com.projet.j2ee.service.g_vente.LigneCmdService;


@RestController
@EnableAutoConfiguration
@RequestMapping("/ligneCmd")
@CrossOrigin
public class LigneCommandeRestController {
	@Autowired
	LigneCmdService ligneCmdService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<LigneCmd> getAllLigneCmds()
	{
		return ligneCmdService.getAllLigneCmd();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public LigneCmd getLigneCmdById(@PathVariable("id") int id) {
		return ligneCmdService.getLigneCmd(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public LigneCmd createLigneCmd(@RequestBody LigneCmd ligneCmd) {
			return ligneCmdService.saveLigneCmd(ligneCmd);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public LigneCmd updateLigneCmd(@RequestBody LigneCmd ligneCmd) {
		return ligneCmdService.updateLigneCmd(ligneCmd);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteLigneCmd(@PathVariable("id") int id)
	{
		ligneCmdService.deleteLigneCmdById(id);
	}
	
}
