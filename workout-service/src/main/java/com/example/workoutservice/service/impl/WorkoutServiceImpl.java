package com.example.workoutservice.service.impl;

import com.example.workoutservice.entity.Workout;
import com.example.workoutservice.repository.WorkoutRepository;
import com.example.workoutservice.service.WorkoutService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService {
    private final WorkoutRepository workoutRepository;

    public WorkoutServiceImpl(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }
}
