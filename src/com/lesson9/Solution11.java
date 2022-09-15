package com.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Solution11 {
    /*
    1. Create collection of HashMap<String, Object>
    2. Put 10 Strings there
    3. Print the map, each pair from new line
    Example:
        Sim - 5
     */
    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        Object obj6 = new Object();
        Object obj7 = new Object();
        Object obj8 = new Object();
        Object obj9 = new Object();
        Object obj10 = new Object();


        Map<String, Object> map = new HashMap<>();
        map.put("1", obj1);
        map.put("2", obj2);
        map.put("3", obj3);
        map.put("4", obj4);
        map.put("5", obj5);
        map.put("6", obj6);
        map.put("7", obj7);
        map.put("8", obj8);
        map.put("9", obj9);
        map.put("10", obj10);


        for (Map.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}