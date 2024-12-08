package com.project.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.notification.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
