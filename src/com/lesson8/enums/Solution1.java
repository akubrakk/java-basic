package com.lesson8.enums;

import com.lesson7.Car;
import com.lesson7.SportCar;

public class Solution1 {
    /*
    Implement method getLetterPosition
    It should return position of the letter
    Example: A - 1, B - 2
     */
    public static void main(String[] args) {
        Alphabet a = Alphabet.A;
        System.out.println(a + " " + a.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;


        int getLetterPosition() {

            return ordinal() + 1;
        }
    }
}