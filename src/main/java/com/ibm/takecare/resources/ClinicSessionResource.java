package com.ibm.takecare.resources;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.takecare.entities.ClinicSession;
import com.ibm.takecare.repositories.ClinicSessionRepository;

@RestController
@RequestMapping("/sessions")
public class ClinicSessionResource {
    
    @Autowired
    private ClinicSessionRepository clinicSessionRepository;
    
    // Requisicao de sessão por data e horario
    @GetMapping("/searchByDateAndTime")
    public List<ClinicSession> searchSessionByDateAndTime(
        @RequestParam("date") LocalDate date, @RequestParam("time") LocalTime time){
        return clinicSessionRepository.findByDateAndTime(date, time);
    }


    // Requisicao de adição de nova sessão (requisito 1)
    @PostMapping
    public ClinicSession addNewClinicSession(ClinicSession clinicSession){
        return clinicSessionRepository.save(clinicSession);

    }

}