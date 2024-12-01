package com.project.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.order.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
