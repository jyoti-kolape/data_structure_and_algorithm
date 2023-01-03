package com.practice.ds.scaler.practice.day40;

public class Factorial {
    public static int solve(int A) {
        if(A == 0 || A == 1){
            return A;
        }else{
            return A * solve(A-1);
        }
    }

    public static void main(String args[]){
        System.out.println(solve(1));
    }
}
