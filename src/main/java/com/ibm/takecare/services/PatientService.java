package com.ibm.takecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.takecare.entities.Patient;

@Service
public class PatientService {
    
    @Autowired
    private Patient patientRepository;

    // implementar o resto dps
}
