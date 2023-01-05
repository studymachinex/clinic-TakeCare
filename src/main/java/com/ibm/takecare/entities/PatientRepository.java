package com.ibm.takecare.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.takecare.repositories.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
    
}
