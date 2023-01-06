package com.ibm.takecare.config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.ibm.takecare.entities.ClinicSession;
import com.ibm.takecare.repositories.ClinicSessionRepository;

@Configuration
@Profile(value = "test")
public class testConfig implements CommandLineRunner{
    
    @Autowired
    private ClinicSessionRepository clinicSessionRepository;
    
    // LocalDate/time.parse(variavel a ser parseada, DateTimeFormatter.ofPattern("dd/MM/yyyy") ou HH:mm:ss


    // Implementar método run com os dados para teste.
    @Override
    public void run(String... args){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        ClinicSession clinic = new ClinicSession
        ( LocalDate.parse("06/01/2023", dateFormatter)
        , LocalTime.parse("03:00", timeFormatter)
        , null);

    }
}