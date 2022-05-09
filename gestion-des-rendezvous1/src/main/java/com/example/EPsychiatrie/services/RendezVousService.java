package com.example.EPsychiatrie.services;
import com.example.EPsychiatrie.entitie.RendezVous;

import java.util.List;
public interface RendezVousService {

	RendezVous saveRendezVous(RendezVous p);
	RendezVous updateRendezVous(RendezVous p);
	void deleteRendezVous(RendezVous p);
	void deleteRendezVousById(Long id);
	RendezVous getRendezVous (Long id);
	List<RendezVous> getAllRendezVouss();
}
