package com.example.EPsychiatrie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EPsychiatrie.entitie.Patient;
import com.example.EPsychiatrie.repositroy.*;


@Service
public class PatientServiceImplementation implements PatientService{

	public PatientServiceImplementation() {
		super();
	}
	
	@Autowired 
	PatientRepository patientRepository;
	
	@Autowired 
	public PatientServiceImplementation(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}

	
	@Override
	public Patient savePatient(Patient p) {
		return patientRepository.save(p);
	}



	@Override
	public Patient updatePatient(Patient p){
		return patientRepository.save(p);
	}
	
	@Override
	public void deletePatient(Patient p){
		patientRepository.delete(p);
	}
	
	@Override
	public void deletePatientById(Long id){
		patientRepository.deleteById(id);
	}
	
	@Override
	public Patient getPatient (Long id){
		
		Patient p=patientRepository.findById(id).orElse(null);
		return p;
	}
	
	@Override
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}
	
	
}
