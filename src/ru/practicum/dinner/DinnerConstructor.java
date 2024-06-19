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
        if (dishesByTypes.containsKey(dishType)) { // Проверка на наличие введённого типа блюд с списке
            if (dishesByTypes.get(dishType).contains(dishName)) { // Проверка на наличие введённого блюда с списке
                System.out.println("Такое блюдо уже есть в списке блюд данного типа!");
            } else {
                dishesByTypes.get(dishType).add(dishName); // Добавление блюда в список соответствующего типа
                System.out.println("Блюдо добавлено!");
            }
        } else {
            ArrayList<String> dishes = new ArrayList<>(); // Создание нового списка блюд для нового типа
            dishes.add(dishName); // Добавление нового блюда в список
            dishesByTypes.put(dishType, dishes); // Добавление нового типа блюд со своим списком блюд
            System.out.println("Блюдо добавлено!");
        }
    }

    boolean checkType(String type) {
        return dishesByTypes.containsKey(type); // Проверка на наличие данного типа блюд в списке
    }

    void generateDishCombo(ArrayList<String> dishesTypesByKombo, int numberOfCombos) {
        for (int i = 0; i < numberOfCombos; i++) { // Цикл который зависит от количества требуемых вариантов Комбо
            ArrayList<String> dishesNameByKombo = new ArrayList<>(); // Список, в который записываются блюда для Комбо
            for (String type : dishesTypesByKombo) {
                dishesNameByKombo.add(dishesByTypes.get(type).get(random.nextInt(dishesByTypes.get(type).size())));
                // Добавляем в список блюда
            }
            System.out.println("Комбо " + (i + 1)); // Вывод сформированных Комбо
            System.out.println(dishesNameByKombo);
        }
    }
}

