package com.ironhack.hellomotor.repository;

import com.ironhack.hellomotor.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
