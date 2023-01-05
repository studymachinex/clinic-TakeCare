package com.ibm.takecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibm.takecare.entities.ClinicSession;

@Repository
public interface ClinicSessionRepository extends JpaRepository<ClinicSession, Long>{
}