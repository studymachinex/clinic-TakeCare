package com.ibm.takecare.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_session")
public class ClinicSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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