package com.lesson4.whlie;

public class MultiplicationTable {
    /*
    Print to console multiplication table 10*10
    using while loop
    numbers are divided with space " "
    Example output:
    1  2  3  4  5  6  7  8  9 10
    2  4  6  8 10 12 14 16 18 20
    3  6  9 12 15 18 21 24 27 30
     */
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            int b = 1;
            while (b <= 10) {
                System.out.print((a * b) + " ");
                b++;
            }
            a++;
            System.out.println();
        }
    }
}
