package com.ibm.takecare.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.takecare.entities.ClinicSession;
import com.ibm.takecare.repositories.ClinicSessionRepository;
import com.ibm.takecare.resources.enums.ClinicSessionStatus;

@Service
public class ClinicSessionService {

    @Autowired
    private ClinicSessionRepository clinicSessionRepository;

    // Adiciona nova sessão clinica

    public ClinicSession addNewSession(ClinicSession session){
        return clinicSessionRepository.save(session);
    }

    // Lista todas as sessões clinicas
    public List<ClinicSession> findAll(){
        return clinicSessionRepository.findAll();
    }

    // Busca sessao por data e horario
    public List<ClinicSession> findByDateAndTime(LocalDate date, LocalTime time){
        return clinicSessionRepository.findByDateAndTime(date, time);
    }
    // Starta sessao
    public void startSession(){
        ClinicSessionStatus status = ClinicSessionStatus.SESSION_STARTED;
    }

}