package com.project.fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.fleet.model.Fleet;

public interface FleetRepository extends JpaRepository<Fleet, Long> {

}
