package com.example.EPsychiatrie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EPsychiatrie.entitie.Ordonnance;
import com.example.EPsychiatrie.repositroy.*;


@Service
public class OrdonnanceServiceImplementation implements OrdonnanceService{

	@Autowired 
	OrdonnanceRepository OrdonnanceRepository;
	
	@Override
	public Ordonnance saveOrdonnance(Ordonnance p) {
		return OrdonnanceRepository.save(p);
	}
	
	
	@Override
	public Ordonnance updateOrdonnance(Ordonnance p){
		return OrdonnanceRepository.save(p);
	}
	
	@Override
	public void deleteOrdonnance(Ordonnance p){
		OrdonnanceRepository.delete(p);
	}
	
	@Override
	public void deleteOrdonnanceById(Long id){
		OrdonnanceRepository.deleteById(id);
	}
	
	@Override
	public Ordonnance getOrdonnance (Long id){
		
		Ordonnance p=OrdonnanceRepository.findById(id).orElse(null);
		return p;
	}
	
	@Override
	public List<Ordonnance> getAllOrdonnances(){
		return OrdonnanceRepository.findAll();
	}
	
	
}
