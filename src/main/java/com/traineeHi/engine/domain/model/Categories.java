package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Categories {
    private final UUID id;
    private String name;
    private State state;
}
