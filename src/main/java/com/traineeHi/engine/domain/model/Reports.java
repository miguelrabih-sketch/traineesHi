package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Reports {
    private final UUID id;
    private User user;
    private User userReport;
    private String description;
    private Double fine;
    private State state;
}
