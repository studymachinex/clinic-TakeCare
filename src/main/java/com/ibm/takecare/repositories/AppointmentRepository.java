package com.ibm.takecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibm.takecare.entities.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
}