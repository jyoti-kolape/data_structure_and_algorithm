package com.practice.ds.scaler;

abstract class School {
    int i = 0;
    public School(){
        display();
        i=2;
    }
    abstract void myMethod();
    void display(){
        System.out.println(i);
    }
}
