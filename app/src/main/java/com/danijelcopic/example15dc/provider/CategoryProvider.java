package com.danijelcopic.example15dc.provider;

import com.danijelcopic.example15dc.model.Category;

import java.util.ArrayList;
import java.util.List;


public class CategoryProvider {

    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Pizza"));
        categories.add(new Category(1, "Salad"));
        categories.add(new Category(2, "Soup"));
        return categories;
    }

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Pizza");
        names.add("Salad");
        names.add("Soup");
        return names;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Pizza");
            case 1:
                return new Category(1, "Salad");
            case 2:
                return new Category(2, "Soup");
            default:
                return null;
        }
    }
}
