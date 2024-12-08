package com.project.traffic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Traffic {
    @Id
    private long   trafficId;
    private String roadStatus;
    private String realTimeTrafficData;
    private double roadDistance;
    private double roadDistances;
    private int    trafficUpdateFrequency;
    private String trafficHistory;

    public Traffic (long trafficId, String roadStatus, String realTimeTrafficData, double roadDistance,
        double roadDistances, int trafficUpdateFrequency, String trafficHistory) {
        super ();
        this.trafficId = trafficId;
        this.roadStatus = roadStatus;
        this.realTimeTrafficData = realTimeTrafficData;
        this.roadDistance = roadDistance;
        this.roadDistances = roadDistances;
        this.trafficUpdateFrequency = trafficUpdateFrequency;
        this.trafficHistory = trafficHistory;
    }

    public Traffic () {
    }

}
