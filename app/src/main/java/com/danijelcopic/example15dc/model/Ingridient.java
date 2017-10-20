package com.danijelcopic.example15dc.model;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static android.media.CamcorderProfile.get;
import static com.danijelcopic.example15dc.R.array.jela;

public class Ingridient {

    private float id;
    private String name;
    private Food foods;

    public Ingridient() {

    }

    public Ingridient(float id, String name) {
        this.id = id;
        this.name = name;
    }


    public Ingridient(float id, String name, Food foods) {
        this.id = id;
        this.name = name;
        this.foods = foods;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFoods() {
        return foods;
    }

    public void setFoods(Food foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return name;
    }
}
