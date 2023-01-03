package com.practice.ds.success1.day23;

public class Fibboncci {
    public static void main(String[] args) {
        System.out.println(findAthFibonacci(9));
    }

    public static int findAthFibonacci(int A) {
        if (A <= 1){
            return A;
        }else{
            return findAthFibonacci(A-1) + findAthFibonacci(A-2);
        }
    }
}
