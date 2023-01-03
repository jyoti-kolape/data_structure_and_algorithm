package com.practice.ds.scaler.practice.day40;

public class SumOfDigits {

    public static int solve(int A) {
        int sum = 0;
        if (A == 0){
            return 0;
        }else{
            return (A % 10 + solve(A / 10));
        }

    }
    public static void main(String args[]){
        System.out.println(solve(11));
    }
}
