package com.example.workoutservice.mapper;

import com.example.workoutservice.dto.WorkoutResponseDTO;
import com.example.workoutservice.entity.Workout;
import org.springframework.stereotype.Component;

@Component
public class WorkoutMapperImpl implements WorkoutMapper {
    @Override
    public WorkoutResponseDTO toDTO(Workout workout) {
        return new WorkoutResponseDTO(workout.getId(), workout.getName(), workout.getStartDate());
    }

    @Override
    public Workout fromDTO(WorkoutResponseDTO workoutResponseDTO) {
        return new Workout(workoutResponseDTO.id(), workoutResponseDTO.name(), workoutResponseDTO.startDate());
    }
}
