package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dishesByTypes;
    Random random = new Random();

    public DinnerConstructor() {
        dishesByTypes = new HashMap<>();
    }

    void addNewDish(String dishType, String dishName) {
        if (dishesByTypes.containsKey(dishType)) {
            dishesByTypes.get(dishType).add(dishName);
        } else {
            ArrayList<String> dishes = new ArrayList<>();
            dishes.add(dishName);
            dishesByTypes.put(dishType, dishes);
        }
    }

    boolean checkType(String type) {
        return dishesByTypes.containsKey(type);
    }

    void generateDishCombo(String type)
}
