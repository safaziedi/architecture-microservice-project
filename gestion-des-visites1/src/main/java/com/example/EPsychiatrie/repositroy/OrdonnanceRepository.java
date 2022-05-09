package com.example.EPsychiatrie.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.EPsychiatrie.entitie.Ordonnance;
@Repository
public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long > {

}
