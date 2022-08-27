package com.lesson4.for_loop;

public class PrintRightTriangle {
    /*
    using for loop print right triangle from 8
    with size 10*10
    Example:
    8
    88
    888
    8888
    .....
     */
    public static void main(String[] args) {

        int[][] triangle = new int[10][10];

        for (int q = 0; q < triangle.length; q++) {
            for (int r = -1; r < q; r++) {
                System.out.print(6);
            }
            System.out.println();
        }
    }
}