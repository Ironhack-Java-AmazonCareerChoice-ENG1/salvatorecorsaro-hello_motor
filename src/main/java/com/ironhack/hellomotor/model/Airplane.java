package com.ironhack.hellomotor.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
public class Airplane extends Vehicle{
    private int numberOfPassenger;

    public Airplane(String manufacturer, String model, int year, int numberOfPassenger) {
        super(manufacturer, model, year);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "numberOfPassenger=" + numberOfPassenger +
                "} " + super.toString();
    }
}
