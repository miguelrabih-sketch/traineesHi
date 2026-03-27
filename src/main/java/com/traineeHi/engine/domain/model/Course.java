package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Time;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Course {
    private final UUID id;
    private String name;
    private List<Lesson> Lesson;
    private State state;
}
