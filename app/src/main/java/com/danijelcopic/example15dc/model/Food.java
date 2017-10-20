package com.danijelcopic.example15dc.model;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;

public class Food {

    private int id;
    private String image;
    private String name;
    private float rating;
    private String description;
    private String calory;
    private double price;
    private Category category;
    private List<Ingridient> ingridients;


    // empty constructor
    public Food() {
        this.ingridients = new ArrayList<Ingridient>();
    }


    // full constructor
    public Food(int id, String image, String name, float rating, String description, Category category, ArrayList<Ingridient> ingridients, String calory, double price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.category = category;
        this.calory = calory;
        this.price = price;
        this.ingridients = ingridients;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalory() {
        return calory;
    }

    public void setCalory(String calory) {
        this.calory = calory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }


    // additional methods

    public void addIngidient(Ingridient ingridient) {

        ingridients.add(ingridient);
    }

    public void removeIngridient(Ingridient ingridient) {

        ingridients.remove(ingridient);
    }

    public Ingridient getIngridient(int position) {

        return ingridients.get(position);
    }

    @Override
    public String toString() {
        return name;
    }

    }
