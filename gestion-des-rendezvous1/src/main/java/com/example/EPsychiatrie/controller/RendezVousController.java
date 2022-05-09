package com.example.EPsychiatrie.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.EPsychiatrie.entitie.RendezVous;
import com.example.EPsychiatrie.services.*;

@RestController
@RequestMapping("/gestiondesrendezvous")
public class RendezVousController {
	@Autowired RendezVousService RendezVousService;
	
	@GetMapping("/lesRendezVouss")
	public List<RendezVous> getRendezVouss(){
		return RendezVousService.getAllRendezVouss();
	}

	
	
	@GetMapping("/afficher/idRendezVous")
	public RendezVous getRendezVousById(@RequestParam(value="idRendezVous")Long id){
		return RendezVousService.getRendezVous(id);
	}
	
	@PostMapping("/creer")
	public RendezVous createRendezVous(RendezVous p)
	{
		return RendezVousService.saveRendezVous(p);
	}
	
	@PutMapping("miseAjour")
	public RendezVous updateRendezVous(RendezVous p)
	{
		return RendezVousService.updateRendezVous(p);
	}
	
	@DeleteMapping("/supprimer/idRendezVous")
	public void deleteRendezVousById (@RequestParam(value="idRendezVous")Long id)
	{
		RendezVousService.deleteRendezVousById(id);
	}
	
	@DeleteMapping("/supprimer")
	public void deleteRendezVous (RendezVous p)
	{
		RendezVousService.deleteRendezVous(p);
	}
	
	
}
