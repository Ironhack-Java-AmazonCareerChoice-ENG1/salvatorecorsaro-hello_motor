package com.ironhack.hellomotor.repository;

import com.ironhack.hellomotor.model.Airplane;
import com.ironhack.hellomotor.model.Car;
import com.ironhack.hellomotor.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

//    List<Car> findAllCar();


}
