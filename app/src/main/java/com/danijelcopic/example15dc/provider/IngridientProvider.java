package com.danijelcopic.example15dc.provider;

import com.danijelcopic.example15dc.model.Category;
import com.danijelcopic.example15dc.model.Food;
import com.danijelcopic.example15dc.model.Ingridient;

import java.util.ArrayList;
import java.util.List;


public class IngridientProvider {

    public static List<Ingridient> getIngridients() {



        ArrayList<Ingridient> ingridients = new ArrayList<>();
        ingridients.add(new Ingridient(0, "fresh mushrooms"));
        ingridients.add(new Ingridient(1, "green peppers"));
        ingridients.add(new Ingridient(2, "pepperoni"));
        ingridients.add(new Ingridient(3, "mozzarella cheese"));
        ingridients.add(new Ingridient(4, "green lettuce"));
        ingridients.add(new Ingridient(5, "olivie oil"));
        ingridients.add(new Ingridient(6, "beacon"));
        ingridients.add(new Ingridient(7, "Parmesan cheese"));
        ingridients.add(new Ingridient(8, "fresh tomato"));
        ingridients.add(new Ingridient(9, "blue cheese"));
        ingridients.add(new Ingridient(10, "croutons"));
        ingridients.add(new Ingridient(11, "black pepper"));

        return ingridients;

    }

    public static List<String> getIngridientsNames() {
        List<String> name = new ArrayList<>();
        name.add("fresh mushrooms");
        name.add("green peppers");
        name.add("pepperoni");
        name.add("mozzarella cheese");
        name.add("green lettuce");
        name.add("olivie oil");
        name.add("beacon");
        name.add("Parmesan cheese");
        name.add("fresh tomato");
        name.add("blue cheese");
        name.add("croutons");
        name.add("black pepper");

        return name;
    }

    public static Ingridient getIngridientsById(int id) {

        switch (id) {
            case 0:
                return new Ingridient(0, "fresh mushrooms");
            case 1:
                return new Ingridient(1, "green peppers");
            case 2:
                return new Ingridient(2, "pepperoni");
            case 3:
                return new Ingridient(3, "mozzarella cheese");
            case 4:
                return new Ingridient(4, "green lettuce");
            case 5:
                return new Ingridient(5, "olivie oil");
            case 6:
                return new Ingridient(6, "beacon");
            case 7:
                return new Ingridient(7, "Parmesan cheese");
            case 8:
                return new Ingridient(8, "fresh tomato");
            case 9:
                return new Ingridient(9, "blue cheese");
            case 10:
                return new Ingridient(10, "croutons");
            case 11:
                return new Ingridient(11, "black pepper");
            default:
                return null;
        }
    }
}
