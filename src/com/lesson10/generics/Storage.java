package com.lesson10.generics;

import java.util.LinkedList;

public class Storage <T>{
     /*
    1. Create generic class Storage with 2 methods
    2. With in this class, create collection
    3. Create method put which saves object of any type to this collection
    4. Create method get which returns the latest added object from the collection and removes it from there
     */

    private T obj;

    LinkedList<T> list = new LinkedList<>();

    public void putObject(T obj){
            list.add(obj);
    }
    public <T> void getLastObjAndRemoveObj(){
        System.out.println(list.getLast());
        list.removeLast();

    }

    public static void main(String[] args) {
        Storage<Integer> list1 = new Storage();
        list1.putObject(1);
        list1.putObject(2);
        list1.getLastObjAndRemoveObj();
    }

}
