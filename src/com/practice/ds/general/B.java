package com.practice.ds.general;

public class B extends A{
    public void getName(){
        System.out.println("In B");
    }

    public void getName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        A a = new B();
        a.getName();
        a.getName("Jyoti");

        B b = new B();

        b.getName();
        b.getName("Tanjila");
    }
}
