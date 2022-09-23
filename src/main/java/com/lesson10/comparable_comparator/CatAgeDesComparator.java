package com.lesson10.comparable_comparator;

import java.util.Comparator;

public class CatAgeDesComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat2.getAge() - cat1.getAge();
    }
}
