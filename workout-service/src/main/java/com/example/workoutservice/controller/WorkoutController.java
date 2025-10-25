package com.example.workoutservice.controller;

import com.example.workoutservice.dto.WorkoutResponseDTO;
import com.example.workoutservice.entity.Workout;
import com.example.workoutservice.mapper.WorkoutMapper;
import com.example.workoutservice.service.WorkoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/workouts")
public class WorkoutController {
    private final WorkoutService workoutService;
    private final WorkoutMapper workoutMapper;

    public WorkoutController(WorkoutService workoutService, WorkoutMapper workoutMapper) {
        this.workoutService = workoutService;
        this.workoutMapper = workoutMapper;
    }

    @GetMapping
    public ResponseEntity<List<WorkoutResponseDTO>> getAllWorkouts() {
       List<WorkoutResponseDTO> workouts = workoutService.getAllWorkouts().stream().map(workoutMapper::toDTO).toList();

       return ResponseEntity.ok().body(workouts);
    };
}
