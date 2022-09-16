package com.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    /*
    1. Create the class Cat with variable name
    2. Create HashMap<String, Cat>
    3. Add to the map 10 cats, as a key, use the name of the Cat
    4. Print to the console each element from new line
     */
    public static class Cat {

        String name;

        public Cat(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }
        public static void main(String[] args) {

            Cat cat1 = new Cat("Mira");
            Cat cat2 = new Cat("Murka");
            Cat cat3 = new Cat("Tom");
            Cat cat4 = new Cat("Murzik");
            Cat cat5 = new Cat("Nyavchyk");
            Cat cat6 = new Cat("Lukas");
            Cat cat7 = new Cat("Pushok");
            Cat cat8 = new Cat("Hvostik");
            Cat cat9 = new Cat("Morda");
            Cat cat10 = new Cat("Kit");


            Map<String, Cat> map = new HashMap<>();
            map.put(cat1.name, cat1);
            map.put(cat2.name, cat2);
            map.put(cat3.name, cat3);
            map.put(cat4.name, cat4);
            map.put(cat5.name, cat5);
            map.put(cat6.name, cat6);
            map.put(cat7.name, cat7);
            map.put(cat8.name, cat8);
            map.put(cat9.name, cat9);
            map.put(cat10.name, cat10);



            for (Map.Entry<String, Cat> pair : map.entrySet()) {
                String key = pair.getKey();
                Cat value = pair.getValue();
                System.out.println(key + " - " + value);
            }
        }
    }
}
