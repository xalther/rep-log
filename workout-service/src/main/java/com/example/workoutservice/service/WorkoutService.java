package com.example.workoutservice.service;

import com.example.workoutservice.entity.Workout;

import java.util.List;

public interface WorkoutService {
    List<Workout> getAllWorkouts();
}
