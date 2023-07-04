package com.ironhack.hellomotor.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtocolRegistration {
    private UUID code;
    private LocalDate releaseDate;
}
