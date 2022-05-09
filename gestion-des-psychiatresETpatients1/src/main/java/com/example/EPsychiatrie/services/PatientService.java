package com.example.EPsychiatrie.services;
import com.example.EPsychiatrie.entitie.Patient;

import java.util.List;
public interface PatientService {

	
	Patient updatePatient(Patient p);
	void deletePatient(Patient p);
	void deletePatientById(Long id);
	Patient getPatient (Long id);
	List<Patient> getAllPatients();
	Patient savePatient(Patient p);
	
}
