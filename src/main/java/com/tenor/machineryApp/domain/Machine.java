package com.tenor.machineryApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maquinarias")
public class Machine {
    @Id
    private String id;
    private int status;
    @Column(name="client_name")
    private String clientName;
    @Column(name="client_zone")
    private int zone;
    private String features;
    private String pending;
    @Column(name="hours_of_use")
    private int hoursOfUse;

    public Machine(int status, String clientName, int zone, String features, String pending, int hoursOfUse) {
        this.status = status;
        this.clientName = clientName;
        this.zone = zone;
        this.features = features;
        this.pending = pending;
        this.hoursOfUse = hoursOfUse;
    }

    protected Machine() {
    }

    public String getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public String getClientName() {
        return clientName;
    }

    public int getZone() {
        return zone;
    }

    public String getFeatures() {
        return features;
    }

    public String getPending() {
        return pending;
    }

    public int getHoursOfUse() {
        return hoursOfUse;
    }
}
