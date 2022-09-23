package com.lesson4.if_else;

import java.util.Scanner;

public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        if (a >= b && a >= c && b >= c)
            System.out.println(a + " " + b + " " + c);
        else if (b >= a && b >= c && a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (c >= b && c >= a && b >= a)
            System.out.println(c + " " + b + " " + a);
        else if (a >= c && a >= b && c >= b)
            System.out.println(a + " " + c + " " + b);
        else if (b > c && b >= a && c >= a)
            System.out.println(b + " " + c + " " + a);
        else if (c >= a && c >= b && a >= b)
            System.out.println(c + " " + a + " " + b);
        /* Find alternative solution
        if (a < b) {
            int x = a;
            a = b;
            b = x;
        }

        if (b < c) {
            int x = b;
            b = c;
            c = x;
        }

        if (a < b) {
            int x = a;
            a = b;
            b = x;
        }
        System.out.println(a + " " + b + " " + c);
*/
    }
}