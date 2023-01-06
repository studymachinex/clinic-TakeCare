package com.ibm.takecare.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import jakarta.persistence.Column;
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
    @Column
    LocalDateTime date;
    
    @Column
    LocalDateTime time;
    
    @Column
    LocalDateTime sessionDuration;
    
    public ClinicSession(){}

    public ClinicSession(LocalDateTime date, LocalDateTime time, LocalDateTime sessionDuration) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(LocalDateTime sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    
}