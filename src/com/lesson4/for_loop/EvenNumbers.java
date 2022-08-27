package com.lesson4.for_loop;

public class EvenNumbers {
    /*
    using for loop
    print even number from 1 to 100 include
    from new line
     */
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number = number + 2) {
            System.out.println(number);
        }
    }
}