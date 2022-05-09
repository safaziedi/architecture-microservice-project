package com.example.EPsychiatrie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EPsychiatrie.entitie.RendezVous;
import com.example.EPsychiatrie.repositroy.*;


@Service
public class RendezVousServiceImplementation implements RendezVousService{

	@Autowired 
	RendezVousRepository RendezVousRepository;
	
	@Override
	public RendezVous saveRendezVous(RendezVous p) {
		return RendezVousRepository.save(p);
	}
	
	
	@Override
	public RendezVous updateRendezVous(RendezVous p){
		return RendezVousRepository.save(p);
	}
	
	@Override
	public void deleteRendezVous(RendezVous p){
		RendezVousRepository.delete(p);
	}
	
	@Override
	public void deleteRendezVousById(Long id){
		RendezVousRepository.deleteById(id);
	}
	
	@Override
	public RendezVous getRendezVous (Long id){
		
		RendezVous p=RendezVousRepository.findById(id).orElse(null);
		return p;
	}
	
	@Override
	public List<RendezVous> getAllRendezVouss(){
		return RendezVousRepository.findAll();
	}
	
	
}
