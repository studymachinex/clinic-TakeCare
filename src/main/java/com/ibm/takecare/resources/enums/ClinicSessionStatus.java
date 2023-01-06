package com.ibm.takecare.resources.enums;

public enum ClinicSessionStatus {
    SESSION_STARTED("Session online"),
    SESSION_NOT_STARTED("Session offline");

    private String status;

    private ClinicSessionStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}