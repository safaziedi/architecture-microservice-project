package com.example.EPsychiatrie.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.example.EPsychiatrie.entitie.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long > {
}
