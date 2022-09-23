package com.lesson4.for_loop;

import sun.awt.geom.AreaOp;

import java.util.Arrays;
import java.util.Scanner;

public class PrintRectangle {
    /*
    Read 2 numbers from console (m & n)
    using for loop
    print to console a rectangle size m * n from 8 numbers
    Example:
    m=2, n=4
    8888
    8888
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        for (int q = 0; q < m; q++) {
            for (int r = 0; r < n; r++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}