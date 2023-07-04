package com.ironhack.hellomotor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "vehicle_type")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String manufacturer;
    private String model;
    private int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
