package com.lesson11;

public class MyExceptions extends IllegalArgumentException{

    public MyExceptions() {
            super("The value should be more than zero");
    }
}
