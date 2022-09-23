package com.lesson8.string;

import java.util.Arrays;

public class StringTask {
    public static void main(String[] args) {
        String s = "Hey how are you";

        System.out.println("String: " + s);

        System.out.println("Length of the string: " + s.length()); //print the length of the string

        System.out.println("Last char of the string: " + s.charAt(s.length() - 1)); //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)

        System.out.println("The index of 'a': " + s.indexOf("a")); //print the index of 'a'

        System.out.println("Substring: " + s.substring(0, 7)); //substirng the string by the second space " " - result should be "Hey how"

        System.out.println("check if the string start with 'h': " + s.startsWith("h")); //check if the string start with 'h', with 'H', end with '\'
        System.out.println("check if the string start with 'H': " + s.startsWith("H"));
        System.out.println("check if the string start with '\\': " + s.startsWith("\\"));

        System.out.println("check if the string contains \"are you\": " + s.contains("are you")); //check if the string contains "are you" contains "are you "

        System.out.println("String replace: " + s.replace("how", "who")); //replace "how" to "who"

        String[] splitting = s.split(" "); //split the string via space " " and print each word from the new line
        Arrays.stream(splitting).forEach(System.out::println);

        System.out.println(getCharQuantityInTheString("Hey how are you", 'o'));//create the method that takes String and char parameters and return the quantity of letters that exist in that string

        greeting("Andrii", 41); //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
    }

    public static int getCharQuantityInTheString(String s, char c) {
        int countOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                countOfLetters++;
        }
        return countOfLetters;
    }

    public static void greeting(String name, int age) {
        System.out.println(String.format("Hey, my name is %s, and I'm %d years old", name, age));
    }
}