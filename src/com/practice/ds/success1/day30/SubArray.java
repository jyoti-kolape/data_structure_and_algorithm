package com.practice.ds.success1.day30;

import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {

    }

    public static int solve(ArrayList<Integer> A) {
        int sum = 0;
        int sum1;
        for (int i = 0; i < A.size(); i++) {
            sum1 = 0;
            for (int j = i; j < A.size(); j++) {
                sum1 = (sum1 | A.get(j));
                sum = sum + sum1;
            }
        }
        return sum;
    }
}
