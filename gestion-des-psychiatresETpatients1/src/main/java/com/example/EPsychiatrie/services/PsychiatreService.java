package com.example.EPsychiatrie.services;
import com.example.EPsychiatrie.entitie.Psychiatre;

import java.util.List;
public interface PsychiatreService {

	Psychiatre savePsychiatre(Psychiatre p);
	Psychiatre updatePsychiatre(Psychiatre p);
	void deletePsychiatre(Psychiatre p);
	void deletePsychiatreById(Long id);
	Psychiatre getPsychiatre (Long id);
	List<Psychiatre> getAllPsychiatres();
}
