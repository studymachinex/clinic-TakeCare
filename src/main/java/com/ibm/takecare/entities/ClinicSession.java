package com.ibm.takecare.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;

@Entity
public class ClinicSession {

    // Pesquisar sobre DTO VALIDATION quando definir os endpoints 
    LocalDate date;
    LocalTime time;
    Duration sessionDuration;
    //qual a diferença entre "duração da consulta" e "duração da sessão", e o que é "qtde equipos"

    public ClinicSession(){}

    public ClinicSession(LocalDate date, LocalTime time, Duration sessionDuration) {
        this.date = date;
        this.time = time;
        this.sessionDuration = sessionDuration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Duration getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(Duration sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    
}