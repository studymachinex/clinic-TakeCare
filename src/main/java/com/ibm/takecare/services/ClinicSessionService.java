package com.ibm.takecare.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.takecare.controller.enums.ClinicSessionStatus;
import com.ibm.takecare.entities.ClinicSession;
import com.ibm.takecare.repositories.ClinicSessionRepository;

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

    public List<ClinicSession> test(){

        ClinicSession clinic1 = new ClinicSession
        (LocalDateTime.parse("2023-01-06T15:00"), LocalDateTime.parse("2023-01-06T15:00")
        , LocalDateTime.parse("2023-01-06T18:00")
        );
        
        ClinicSession clinic2 = new ClinicSession
        (LocalDateTime.parse("2022-04-02T15:00"), LocalDateTime.parse("2022-04-02T15:00")
        , LocalDateTime.parse("2022-04-02T18:00")
        );

        return clinicSessionRepository.saveAll(Arrays.asList(clinic1, clinic2));
        
    }
}