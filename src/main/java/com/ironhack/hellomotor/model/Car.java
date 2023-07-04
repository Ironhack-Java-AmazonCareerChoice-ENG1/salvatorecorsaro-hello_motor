package com.ironhack.hellomotor.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }
}
