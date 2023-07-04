package com.ironhack.hellomotor.repository;

import com.ironhack.hellomotor.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
