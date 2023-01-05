package com.ibm.takecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Patient extends JpaRepository<Patient, Long>{
}