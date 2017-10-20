package com.danijelcopic.example15dc.provider;

import com.danijelcopic.example15dc.model.Category;
import com.danijelcopic.example15dc.model.Ingridient;
import com.danijelcopic.example15dc.model.Food;

import java.util.ArrayList;
import java.util.List;


public class FoodProvider {

    public static List<Food> getFood() {

        Category pizzaCat = new Category(0, "Pizza");
        Category saladCat = new Category(1, "Salad");
        Category soupCat = new Category(2, "Soup");


        ArrayList<Ingridient> pizzaIng = new ArrayList<>();
        pizzaIng.add(new Ingridient(0, "fresh mushrooms"));
        pizzaIng.add(new Ingridient(1, "green peppers"));
        pizzaIng.add(new Ingridient(2, "pepperoni"));
        pizzaIng.add(new Ingridient(3, "mozzarella cheese"));

        ArrayList<Ingridient> saladIng = new ArrayList<>();
        saladIng.add(new Ingridient(4, "green lettuce"));
        saladIng.add(new Ingridient(5, "olivie oil"));
        saladIng.add(new Ingridient(6, "beacon"));
        saladIng.add(new Ingridient(7, "Parmesan cheese"));

        ArrayList<Ingridient> soupIng = new ArrayList<>();
        soupIng.add(new Ingridient(8, "fresh tomato"));
        soupIng.add(new Ingridient(9, "blue cheese"));
        soupIng.add(new Ingridient(10, "croutons"));
        soupIng.add(new Ingridient(11, "black pepper"));


        List<Food> foods = new ArrayList<>();
        foods.add(new Food(0, "pizza.png", "PIZZA MARGHERITA", 3.0f, "hot pizza with chilli flakes", pizzaCat, pizzaIng, "100g  eq.  266kcal", 9.45));
        foods.add(new Food(1, "salad.png", "CAESAR SALAD", 4.0f, "fresh salad with bacon and cheese", saladCat, saladIng, "100g  eq.  166kcal", 7.73));
        foods.add(new Food(2, "soup.png", "TOMATO SOUP", 5.0f, "tomato soup with blue cheese", soupCat, soupIng, "100g  eq.  98kcal", 4.92));

        return foods;
    }


    public static List<String> getFoodNames() {

        List<String> names = new ArrayList<>();
        names.add("PIZZA MARGHERITA");
        names.add("CAESAR SALAD");
        names.add("TOMATO SOUP");

        return names;
    }


    public static Food getFoodById(int id) {

        Category pizzaCat = new Category(0, "Pizza");
        Category saladCat = new Category(1, "Salad");
        Category soupCat = new Category(2, "Soup");

        ArrayList<Ingridient> pizzaIng = new ArrayList<>();
        pizzaIng.add(new Ingridient(0, "fresh mushrooms"));
        pizzaIng.add(new Ingridient(1, "green peppers"));
        pizzaIng.add(new Ingridient(2, "pepperoni"));
        pizzaIng.add(new Ingridient(3, "mozzarella cheese"));

        ArrayList<Ingridient> saladIng = new ArrayList<>();
        saladIng.add(new Ingridient(4, "green lettuce"));
        saladIng.add(new Ingridient(5, "olivie oil"));
        saladIng.add(new Ingridient(6, "beacon"));
        saladIng.add(new Ingridient(7, "Parmesan cheese"));

        ArrayList<Ingridient> soupIng = new ArrayList<>();
        soupIng.add(new Ingridient(8, "fresh tomato"));
        soupIng.add(new Ingridient(9, "blue cheese"));
        soupIng.add(new Ingridient(10, "croutons"));
        soupIng.add(new Ingridient(11, "black pepper"));

        switch (id) {
            case 0:
                return new Food(0, "pizza.png", "PIZZA MARGHERITA", 3.0f, "hot pizza with chilli flakes", pizzaCat, pizzaIng, "100g  eq.  266kcal", 9.45);
            case 1:
                return new Food(1, "salad.png", "CAESAR SALAD", 4.0f, "fresh salad with bacon and cheese", saladCat, saladIng, "100g  eq.  166kcal", 7.73);
            case 2:
                return new Food(2, "soup.png", "TOMATO SOUP", 5.0f, "tomato soup with blue cheese", soupCat, soupIng, "100g  eq.  98kcal", 4.92);
            default:
                return null;
        }
    }
}
