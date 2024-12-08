package com.project.route_opt_ms.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Route {
    @Id
    private long   routeId;
    private String vehicleRoutes;
    private String currentTrafficData;
    private long   vehicleId;
    private String optimizedRoute;
    private Date   estimatedArrivalTime;
    private String priorityLevel;
    private String currentTrafficConditions;
    private double totalDistance;

    public Route (long routeId, String vehicleRoutes, String currentTrafficData, long vehicleId, String optimizedRoute,
        Date estimatedArrivalTime, String priorityLevel, String currentTrafficConditions, double totalDistance) {
        super ();
        this.routeId = routeId;
        this.vehicleRoutes = vehicleRoutes;
        this.currentTrafficData = currentTrafficData;
        this.vehicleId = vehicleId;
        this.optimizedRoute = optimizedRoute;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.priorityLevel = priorityLevel;
        this.currentTrafficConditions = currentTrafficConditions;
        this.totalDistance = totalDistance;
    }

    public Route () {
    }
}
