package com.lesson5.classes;


public class Cat {
    String name;
    int weight;
    int age;


    public static void main(String[] args) {
        Cat cat1 = new Cat("Mira", 5, 4);
        Cat cat2 = new Cat("Rudyk", 3, 3);
        Cat cat3 = new Cat("Myrchuk", 4, 4);


        System.out.println("Round 1 " + cat1.getName() + " vs "  + cat2.getName() + " result: " + cat1.fight(cat2));
        System.out.println("Round 2 " + cat2.getName() + " vs " + cat3.getName() + " result: " + cat2.fight(cat3));
        System.out.println("Round 3 " + cat3.getName() + " vs " + cat1.getName() + " result: " + cat3.fight(cat1));


    }

    Cat(String name, int weight, int age) {
        this.setName(name);
        this.setWeight(weight);
        this.setAge(age);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean fight(Cat anotherCat) {
        int winAnotherCat = 0;
        int winThisCat = 0;

        if (anotherCat.age < this.age) winThisCat++;
        else if (anotherCat.age == this.age) ;
        else winAnotherCat++;
        if (anotherCat.weight < this.weight) winThisCat++;
        else if (anotherCat.weight == this.weight) ;
        else winAnotherCat++;
        if (winThisCat > winAnotherCat) return true;

        else return false;

    }

}
