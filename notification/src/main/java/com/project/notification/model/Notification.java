package com.project.notification.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Notification {
    @Id
    private long   notificationId;
    private long   orderId;
    private long   customerId;
    private double deliveryETA;
    private String notificationType;
    private Date   timestamp;
    private String messageContent;

    public Notification (long notificationId, long orderId, long customerId, double deliveryETA,
        String notificationType, Date timestamp, String messageContent) {
        super ();
        this.notificationId = notificationId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.deliveryETA = deliveryETA;
        this.notificationType = notificationType;
        this.timestamp = timestamp;
        this.messageContent = messageContent;
    }

    public Notification () {
    }
}
