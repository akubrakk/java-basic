package com.lesson5.array;

import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {
        //implement me
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 text line:");

        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i - 1]);
        }
    }
}