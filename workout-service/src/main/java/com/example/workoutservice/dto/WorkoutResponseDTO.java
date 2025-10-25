package com.example.workoutservice.dto;


import java.time.LocalDate;
import java.util.UUID;

public record WorkoutResponseDTO(
        UUID id,
        String name,
        LocalDate startDate
) {};
