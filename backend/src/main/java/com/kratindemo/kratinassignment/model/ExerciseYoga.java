package com.kratindemo.kratinassignment.model;

public class ExerciseYoga {
    private String name;
    private String description;
    private String imageUrl;

    // Default constructor
    public ExerciseYoga() {
    }

    // Parameterized constructor
    public ExerciseYoga(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
