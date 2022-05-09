package com.example.EPsychiatrie.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.EPsychiatrie.entitie.Psychiatre;
import com.example.EPsychiatrie.entitie.Rendezvous;
import com.example.EPsychiatrie.services.*;

@RestController
@RequestMapping("/gestiondespsychiatresetPsychiatres/psychiatre")
public class PsychiatreController {
	@Autowired PsychiatreService PsychiatreService;
	@Autowired RendezvousConsummer rendezvous;
	
	@GetMapping("/lesPsychiatres")
	public List<Psychiatre> getPsychiatres(){
		return PsychiatreService.getAllPsychiatres();
	}

	
	
	@GetMapping("/afficher/idPsychiatre")
	public Psychiatre getPsychiatreById(@RequestParam(value="idPsychiatre")Long id){
		return PsychiatreService.getPsychiatre(id);
	}
	
	@PostMapping("/creer")
	public Psychiatre createPsychiatre(Psychiatre p)
	{
		return PsychiatreService.savePsychiatre(p);
	}
	
	@PutMapping("miseAjour")
	public Psychiatre updatePsychiatre(Psychiatre p)
	{
		return PsychiatreService.updatePsychiatre(p);
	}
	
	@DeleteMapping("/supprimer/idPsychiatre")
	public void deletePsychiatreById (@RequestParam(value="idPsychiatre")Long id)
	{
		PsychiatreService.deletePsychiatreById(id);
	}
	
	@DeleteMapping("/supprimer")
	public void deletePsychiatre (Psychiatre p)
	{
		PsychiatreService.deletePsychiatre(p);
	}
	
	
	
	@GetMapping("/affichermesrendezvous/idPsychiatre")
	public List<Rendezvous> getRendezvous(@RequestParam(value="idPsychiatre")Long id){
		return this.rendezvous.getRendezvouss();
	}
	
}
