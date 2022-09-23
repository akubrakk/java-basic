package com.lesson10.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cat implements Comparable <Cat>{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        Cat murzik = new Cat("Murzik", 2);
        Cat laki = new Cat("Laki",3);
        Cat ponchyk = new Cat("Ponchyk", 4);

        cats.add(murzik);
        cats.add(laki);
        cats.add(ponchyk);

        Collections.sort(cats);
        for (Cat cat:cats) {
            System.out.println(cat);
        }

        System.out.println("--------------------------------");

        Collections.sort(cats, new CatNameComparator());
        for (Cat cat:cats) {
            System.out.println(cat);
        }
        System.out.println("--------------------------------");

        Collections.sort(cats, new CatAgeDesComparator());
        for (Cat cat:cats) {
            System.out.println(cat);
        }
        System.out.println("--------------------------------");

        Collections.sort(cats, new CatAgeAscComparator());
        for (Cat cat:cats) {
            System.out.println(cat);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Cat cat) {
        return name.compareTo(cat.getName());
    }


}
