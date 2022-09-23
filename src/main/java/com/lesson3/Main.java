package com.lesson3;

import static java.lang.Math.addExact;

public class Main {

    public static void printMessage(String s) {
        System.out.println(s);
    }

    private static void printSum(int a, int b) {
        System.out.println(addExact(a, b));
    }

    public static void main(String[] args) {
        String s = "Count of times to write code correctly";
        printMessage(s);
        printSum(5, 3);
    }


}


