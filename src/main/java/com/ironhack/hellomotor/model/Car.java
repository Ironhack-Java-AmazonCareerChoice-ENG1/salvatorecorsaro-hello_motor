package com.ironhack.hellomotor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car extends Vehicle{
    private int numberOfDoors;
    @Enumerated(EnumType.STRING)
    private CarType type;

    public Car(String manufacturer, String model, int year, int numberOfDoors, CarType type) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", type=" + type +
                "} " + super.toString();
    }
}
