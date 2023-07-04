package com.ironhack.hellomotor.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Airplane extends Vehicle{
    private int numberOfPassenger;

    public Airplane(String manufacturer, String model, int year, int numberOfPassenger) {
        super.getManufacturer(manufacturer);
        this.numberOfPassenger = numberOfPassenger;
    }
}