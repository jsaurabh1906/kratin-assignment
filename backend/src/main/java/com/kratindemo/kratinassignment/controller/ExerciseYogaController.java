package com.kratindemo.kratinassignment.controller;

import com.kratindemo.kratinassignment.model.ExerciseYoga;
import com.kratindemo.kratinassignment.service.impl.ExerciseYogaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ExerciseYogaController {
    private ExerciseYogaServiceImpl exerciseYogaService;

    @Autowired
    public ExerciseYogaController(ExerciseYogaServiceImpl exerciseYogaService) {
        this.exerciseYogaService = exerciseYogaService;
    }

    @GetMapping("/exercises")
    public List<ExerciseYoga> getAllExercises() {
        return exerciseYogaService.getAllExercises();
    }

    @PostMapping("/exercises")
    public ExerciseYoga createExercise(@RequestBody ExerciseYoga exercise) {
        return exerciseYogaService.createExercise(exercise);
    }
}
