package com.example.food_app.model;

public class FoodItem {
    private String name;
    private String description;

    // Constructors, getters, and setters
    public FoodItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

