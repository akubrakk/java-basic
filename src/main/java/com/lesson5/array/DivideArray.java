package com.lesson5.array;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        int[] bigArray = new int[20];
        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < 20; i++) {
            bigArray[i] = scanner.nextInt();
        }

        int b = 0;
        for (int a = 0; a < 20; a++) {
            if (a < 10) {
                arraySmall1[a] = bigArray[a];
            } else {
                arraySmall2[b] = bigArray[a];
                System.out.println(arraySmall2[b]);
                b = b + 1;
            }
        }

    }

}