package com.ironhack.hellomotor.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class Airplane extends Vehicle{
    private int numberOfPassenger;

    @Embedded
    private ProtocolRegistration protocolRegistration;

    @ManyToMany(mappedBy = "airplanes")
    private List<Pilot> pilots;
    public Airplane(String manufacturer, String model, int year, int numberOfPassenger, ProtocolRegistration protocolRegistration) {
        super(manufacturer, model, year);
        this.numberOfPassenger = numberOfPassenger;
        this.protocolRegistration = protocolRegistration;
    }
}
