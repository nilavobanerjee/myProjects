package com.project.fleet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Fleet {
    @Id
    private long   vehicleId;
    private String currentLocation;
    private int    capacity;
    private int    availableCapacity;
    private double fuelLevel;
    private String maintenanceStatus;
    private String assignedRoute;
    private double ETA;

    public Fleet (long vehicleId, String currentLocation, int capacity, int availableCapacity, double fuelLevel,
        String maintenanceStatus, String assignedRoute, double eTA) {
        super ();
        this.vehicleId = vehicleId;
        this.currentLocation = currentLocation;
        this.capacity = capacity;
        this.availableCapacity = availableCapacity;
        this.fuelLevel = fuelLevel;
        this.maintenanceStatus = maintenanceStatus;
        this.assignedRoute = assignedRoute;
        ETA = eTA;
    }

    public Fleet () {
    }
}
