package com.lesson4.whlie;

public class SSquare {
    /*
    print to console a square 10*10 with 'S'
    using loop while
     */
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            int b = 0;
            while (b < 10) {
                System.out.print("S");
                b++;
            }
            a++;
            System.out.println();
        }
    }
}