package com.danijelcopic.example15dc.model;


import java.util.ArrayList;
import java.util.List;

import static android.media.CamcorderProfile.get;
import static com.danijelcopic.example15dc.R.array.jela;

public class Category {

    private int id;
    private String name;
    private List<Food> foods;

    public Category() {
        this.foods = new ArrayList<Food>();
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.foods = new ArrayList<Food>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    // additional methods

    public void addFood(Food food) {

        foods.add(food);
    }

    public void removeFood(Food food) {

        foods.remove(food);
    }

    public Food getFood(int position) {

        return foods.get(position);
    }

}
