package com.kratindemo.kratinassignment.service.impl;

import com.kratindemo.kratinassignment.model.ExerciseYoga;

import java.util.List;

public interface ExerciseYogaService {
    List<ExerciseYoga> getAllExercises();
    ExerciseYoga createExercise(ExerciseYoga exercise);
}
