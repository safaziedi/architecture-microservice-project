package com.example.EPsychiatrie.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import com.example.EPsychiatrie.entitie.*;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("gestiondesrendezvous-microservice")
public interface RendezvousConsummer {
	
	@GetMapping("/gestiondesrendezvous/lesRendezVouss")
	public List<Rendezvous> getRendezvouss();

}
