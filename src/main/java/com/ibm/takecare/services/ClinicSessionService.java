package com.ibm.takecare.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.takecare.entities.ClinicSession;
import com.ibm.takecare.repositories.ClinicSessionRepository;

@Service
public class ClinicSessionService {

    @Autowired
    private ClinicSessionRepository clinicSessionRepository;

    public List<ClinicSession> findAll(){
        return clinicSessionRepository.findAll();
    }

    public List<ClinicSession> findByDateAndTime(LocalDate date, LocalTime time){
        return clinicSessionRepository.findByDateAndTime(date, time);
    }

}