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
import com.example.EPsychiatrie.entitie.Ordonnance;
import com.example.EPsychiatrie.services.*;

@RestController
@RequestMapping("/gestiondesvisites/Ordonnance")
public class OrdonnanceController {
	@Autowired OrdonnanceService OrdonnanceService;
	
	@GetMapping("/lesOrdonnances")
	public List<Ordonnance> getOrdonnances(){
		return OrdonnanceService.getAllOrdonnances();
	}

	
	
	@GetMapping("/afficher/idOrdonnance")
	public Ordonnance getOrdonnanceById(@RequestParam(value="idOrdonnance")Long id){
		return OrdonnanceService.getOrdonnance(id);
	}
	
	@PostMapping("/creer")
	public Ordonnance createOrdonnance(Ordonnance p)
	{
		return OrdonnanceService.saveOrdonnance(p);
	}
	
	@PutMapping("miseAjour")
	public Ordonnance updateOrdonnance(Ordonnance p)
	{
		return OrdonnanceService.updateOrdonnance(p);
	}
	
	@DeleteMapping("/supprimer/idOrdonnance")
	public void deleteOrdonnanceById (@RequestParam(value="idOrdonnance")Long id)
	{
		OrdonnanceService.deleteOrdonnanceById(id);
	}
	
	@DeleteMapping("/supprimer")
	public void deleteOrdonnance (Ordonnance p)
	{
		OrdonnanceService.deleteOrdonnance(p);
	}
	
	
}
