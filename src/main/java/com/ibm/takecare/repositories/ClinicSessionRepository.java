package com.ibm.takecare.repositories;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibm.takecare.entities.ClinicSession;

@Repository
public interface ClinicSessionRepository extends JpaRepository<ClinicSession, Long>{
// o Spring é capaz de retornar consultas personalizadas pelo prefixo "findBy" comparando o resto com os parametros
// passados no método
    List<ClinicSession> findByDateAndTime(LocalDate date, LocalTime time);
}