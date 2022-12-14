package com.lesson9;

import java.util.ArrayList;

public class Solution1 {
    /*
    1. Create List of Strings
    2. Add 5 different strings
    3. Print to the console the size of the List
    4. Using loop, print all the items to the console from the List
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Size of the List: " + list.size() + " items");
    }
}