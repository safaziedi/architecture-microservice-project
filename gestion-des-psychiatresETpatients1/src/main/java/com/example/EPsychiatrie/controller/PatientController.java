package com.example.EPsychiatrie.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.EPsychiatrie.entitie.Patient;
import com.example.EPsychiatrie.services.*;

@RestController
@RequestMapping("/gestiondespsychiatresetpatients/patient")
public class PatientController {
	@Autowired PatientService patientService;
	
	@GetMapping("/lespatients")
	@ResponseBody
	public List<Patient> getPatients(){
		return patientService.getAllPatients();
	}

	
	
	@GetMapping("/afficher/idPatient")
	@ResponseBody
	public Patient getPatientById(@PathVariable(value="idPatient")Long id){
		return patientService.getPatient(id);
	}
	
	@PostMapping("/creer")
	@ResponseBody
	public Patient createPatient(@RequestBody Patient p)
	{
		return patientService.savePatient(p);
	}
	
	@PutMapping("miseAjour")
	@ResponseBody
	public Patient updatePatient(@RequestBody Patient p)
	{
		return patientService.updatePatient(p);
	}
	
	@DeleteMapping("/supprimer/{idPatient}")
	@ResponseBody
	public void deletePatientById (@PathVariable(value="idPatient")Long id)
	{
		patientService.deletePatientById(id);
	}
	
	@DeleteMapping("/supprimer")
	@ResponseBody
	public void deletePatient (@RequestBody Patient p)
	{
		patientService.deletePatient(p);
	}
	
	
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public Long getIdPatient(@PathVariable(value="id") Long id) {
		return id;
	}
	
	
	
}
	
	
	
	
