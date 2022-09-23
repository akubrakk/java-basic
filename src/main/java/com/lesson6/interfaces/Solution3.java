package com.lesson6.interfaces;

public class Solution3 {
    /*
    There are interfaces Fly, Move, Eat.
    Add proper interfaces to the classes: Dog, Car, Duck, Airplane
     */

    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }

    public class Dog implements Eat {

        @Override
        public void eat() {

        }
    }

    public class Car implements Move {

        @Override
        public void move() {

        }
    }

    public class Duck implements Fly {
        @Override
        public void fly() {

        }
    }

    public class Airplane implements Fly {
        @Override
        public void fly() {

        }
    }
}

