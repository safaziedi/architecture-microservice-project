package com.example.EPsychiatrie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EPsychiatrie.entitie.Psychiatre;
import com.example.EPsychiatrie.repositroy.*;


@Service
public class PsychiatreServiceImplementation implements PsychiatreService{

	@Autowired 
	PsychiatreRepository PsychiatreRepository;
	
	@Override
	public Psychiatre savePsychiatre(Psychiatre p) {
		return PsychiatreRepository.save(p);
	}
	
	
	@Override
	public Psychiatre updatePsychiatre(Psychiatre p){
		return PsychiatreRepository.save(p);
	}
	
	@Override
	public void deletePsychiatre(Psychiatre p){
		PsychiatreRepository.delete(p);
	}
	
	@Override
	public void deletePsychiatreById(Long id){
		PsychiatreRepository.deleteById(id);
	}
	
	@Override
	public Psychiatre getPsychiatre (Long id){
		
		Psychiatre p=PsychiatreRepository.findById(id).orElse(null);
		return p;
	}
	
	@Override
	public List<Psychiatre> getAllPsychiatres(){
		return PsychiatreRepository.findAll();
	}
	
	
}
