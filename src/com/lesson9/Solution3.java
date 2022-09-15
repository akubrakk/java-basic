package com.lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Using loop find the shortest string in the List
    4. Print to the console found string
    5. If there are several shortest strings, print each of them.
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");

        int minSize = 10000;
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
            String s = list.get(i);

            if (minSize > s.length()) {
                minSize = s.length();
            }
        }
        scanner.close();
        for (int i = 0; i < list.size(); i++) {
            String l = list.get(i);
            if (l.length() == minSize) {
                System.out.println(list.get(i));
            }
        }
    }
}