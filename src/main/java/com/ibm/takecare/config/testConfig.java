package com.ibm.takecare.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ibm.takecare.repositories.ClinicSessionRepository;

@Configuration
@Profile(value = "test")
public class testConfig implements CommandLineRunner{
    
    @Autowired
    private ClinicSessionRepository clinicSessionRepository;
    
    // LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));


    // Implementar método run com os dados para teste.

    @Override
    public void run(String... args){

    }
}