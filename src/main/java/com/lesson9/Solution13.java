package com.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    /*
    1. Create Map<String, String>
    2. Put there 10 elements (key-Surname, value-Name)
    3. Remove people who have the same names
    4. Print the result, each element from new line
     */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Hooper", "Eric");
        map.put("Washburn", "Rodney");
        map.put("Hamm", "Louvenia");
        map.put("French", "Stacie");
        map.put("Williams", "Eric");
        map.put("McCoy", "David");
        map.put("Cox", "Stacie");
        map.put("Nosal", "Robert");
        map.put("Browning", "Anna");
        map.put("Lopez", "Yvonne");

        Map<String, String> map2 = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            map2.put(pair.getValue(), pair.getKey());
        }
        System.out.println(map2);

    }

}
