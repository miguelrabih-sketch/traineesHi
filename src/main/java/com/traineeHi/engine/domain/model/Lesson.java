package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Lesson {
    private final UUID id;
    private String name;
    private String content;
    private Double Time;
    private Skill Skill;
    private State state;
}
