package com.example.food_app.service;

import org.springframework.stereotype.Service;

import com.example.food_app.model.FoodItem;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    private final List<FoodItem> foodItems = new ArrayList<>();

    public List<FoodItem> getAllFoodItems() {
        return foodItems;
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }
}

