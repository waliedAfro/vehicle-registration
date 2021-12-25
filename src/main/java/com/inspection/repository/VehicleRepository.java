package com.inspection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inspection.model.Vehicle;

public interface VehicleRepository  extends JpaRepository<Vehicle, Long>{

}
