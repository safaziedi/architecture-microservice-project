package com.example.EPsychiatrie.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.EPsychiatrie.entitie.RendezVous;
@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long > {

}
