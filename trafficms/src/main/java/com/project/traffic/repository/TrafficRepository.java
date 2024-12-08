package com.project.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.traffic.model.Traffic;

public interface TrafficRepository extends JpaRepository<Traffic, Long> {

}
