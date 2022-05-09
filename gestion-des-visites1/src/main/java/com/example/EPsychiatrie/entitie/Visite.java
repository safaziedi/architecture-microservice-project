package com.example.EPsychiatrie.entitie;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Visite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String details;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idRapport", referencedColumnName = "id")
    private  Rapport rapport;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idOrdonnance", referencedColumnName = "id")
    private  Ordonnance ordonnance;
}