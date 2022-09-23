package com.lesson10.comparable_comparator;

import java.util.Comparator;

public class CatAgeAscComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getAge() - cat2.getAge();
    }
}
