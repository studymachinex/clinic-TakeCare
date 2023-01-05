package com.ibm.takecare.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.takecare.entities.ClinicSession;
import com.ibm.takecare.repositories.ClinicSessionRepository;

@Service
public class ClinicSessionService {

    @Autowired
    private ClinicSessionRepository clinicSessionRepository;

    public List<ClinicSession> findAll(){
        return clinicSessionRepository.findAll();
    }
    

}