package com.practice.ds.success1.day40;

public class Fibonacci {

    public static int findAthFibonacci(int A) {
       if(A < 2){
           return A;
       }else{
           return findAthFibonacci(A-1) + findAthFibonacci(A-2);
       }
    }

    public static void main(String args[]){
        System.out.println(findAthFibonacci(9));
    }
}
