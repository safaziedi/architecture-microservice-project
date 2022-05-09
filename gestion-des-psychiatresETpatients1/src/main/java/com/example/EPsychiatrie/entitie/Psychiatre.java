package com.example.EPsychiatrie.entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
public class Psychiatre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPsychiatre;
	private String nom;
	private String prenom;
	private String email;
	private Long numtel;
}
