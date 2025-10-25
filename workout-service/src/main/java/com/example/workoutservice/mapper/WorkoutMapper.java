package com.example.workoutservice.mapper;

import com.example.workoutservice.dto.WorkoutResponseDTO;
import com.example.workoutservice.entity.Workout;

public interface WorkoutMapper {
    WorkoutResponseDTO toDTO(Workout workout);
    Workout fromDTO(WorkoutResponseDTO workoutResponseDTO);
}
