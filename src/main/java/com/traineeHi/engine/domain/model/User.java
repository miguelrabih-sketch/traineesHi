package com.traineeHi.engine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.UUID;
import java.util.List;

@Getter
@AllArgsConstructor
public class User {
    private final UUID id;
    private String name;
    private String email;
    private String password;
    private TimeWallet timeWallet; // Composición: Un usuario TIENE una billetera
    private List<Skill> skills;    // Relación: Un usuario TIENE muchas habilidades
    private State state;
}