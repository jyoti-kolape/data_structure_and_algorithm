package com.practice.ds.success;

import java.util.ArrayList;

public class MaximumSatisfaction {
    public static void main(String[] args) {
        ArrayList<Integer> A =  new ArrayList<>();
        //A = [10, 20, 15, 4, 14]
        A.add(10);
        A.add(20);
        A.add(15);
        A.add(4);
        A.add(14);
        solve(A);
    }
    public static int solve(ArrayList<Integer> A) {
        int maxValue = 0;
        ArrayList<Integer> andList = new ArrayList<>();
        int var = 0;
        for (int i = 0; i < A.size(); i++){
            var = var & A.get(i);
            andList.add(var);
        }
        return maxValue;
    }
}
