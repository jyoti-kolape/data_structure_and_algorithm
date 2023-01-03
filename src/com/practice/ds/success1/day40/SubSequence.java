package com.practice.ds.success1.day40;

public class SubSequence {

    public static int solve(int A){
        if(A==2){
            return 2;
        }else if(A==0 || A==1){
            return 1;
        }
        return solve(A-1)+ solve(A-2)+solve(A-3)+A;

    }

    public static void main(String[] args) {

        System.out.println(solve(4));
    }
}
