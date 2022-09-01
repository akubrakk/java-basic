package com.lesson5.array;

import java.util.Scanner;

public class TwoArrays {
    /*
    1. Create an Array of Strings, size 10
    2. Create an Array of int, size 10
    3. Read from the console and fill in the Array with Strings
    4. Fill in the int Array with length of Strings from the first Array.
        If the first element contains "Hello", we put in the first element of int Array - 5
    5. Print the int Array to the console
     */
    public static void main(String[] args) {
        //implement me
        String[] array = initializeArray();
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = array[i].length();
            System.out.println(array2[i]);
        }
    }
    private static String[] initializeArray() {
        // implement me
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 words:");
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextLine();
        }
        scanner.close();
        return array;
    }
}