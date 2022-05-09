package com.example.EPsychiatrie.services;
import com.example.EPsychiatrie.entitie.Ordonnance;

import java.util.List;
public interface OrdonnanceService {

	Ordonnance saveOrdonnance(Ordonnance p);
	Ordonnance updateOrdonnance(Ordonnance p);
	void deleteOrdonnance(Ordonnance p);
	void deleteOrdonnanceById(Long id);
	Ordonnance getOrdonnance (Long id);
	List<Ordonnance> getAllOrdonnances();
}
