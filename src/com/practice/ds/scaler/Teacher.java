package com.practice.ds.scaler;

public class Teacher extends School implements Student{
    public Teacher(){
        super();
        i=1;

    }
    @Override
    public void myMethod() {
       new Teacher();
    }
}
