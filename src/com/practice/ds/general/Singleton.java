package com.practice.ds.general;

public class Singleton {

    private static Singleton singleton = null;

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.hashCode());
    }
}
