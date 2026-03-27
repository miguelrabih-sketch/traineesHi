package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class History {
    private final UUID id;
    private User user;
    private Lesson lesson;
    private Double time;
}
