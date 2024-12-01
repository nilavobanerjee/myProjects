package com.project.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Orders {
    @Id
    private long   orderId;
    private long   customerId;
    private String deliveryAddress;
    private String pickUpAddress;
    private String priorityLevel;
    private String orderStatus;
    private String packageSize;
    private String packageWeight;
    private String createdAt;
    private String updatedAt;

    public Orders (long orderId, long customerId, String deliveryAddress, String pickUpAddress, String priorityLevel,
        String orderStatus, String packageSize, String packageWeight, String createdAt, String updatedAt) {
        super ();
        this.orderId = orderId;
        this.customerId = customerId;
        this.deliveryAddress = deliveryAddress;
        this.pickUpAddress = pickUpAddress;
        this.priorityLevel = priorityLevel;
        this.orderStatus = orderStatus;
        this.packageSize = packageSize;
        this.packageWeight = packageWeight;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Orders () {
    }

}
