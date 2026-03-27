package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Skill {
    private final UUID id;
    private String name;
    private Categories categories;
}
