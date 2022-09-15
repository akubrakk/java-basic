package com.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Solution9 {
    /*
    1. Create collection of HashMap<String, String>
    2. Put 10 Strings there
    3. Print the list of Keys, each key from the new line
     */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "Mira");
        map.put("2", "Mira2");
        map.put("3", "Mira3");
        map.put("4", "Mira4");
        map.put("5", "Mira5");
        map.put("6", "Mira6");
        map.put("7", "Mira7");
        map.put("8", "Mira8");
        map.put("9", "Mira9");
        map.put("10", "Mira10");



        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }
    }

}