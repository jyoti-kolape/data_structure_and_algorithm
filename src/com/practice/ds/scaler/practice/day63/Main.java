package com.practice.ds.scaler.practice.day63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {5, -1, -2, -3, 8, 7};
        //Integer[] arr1 = {7, 2, 3, 6, -5, 10, 1, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
       // System.out.println(getMaximumEvenSum(A));

        int x = 1;
        for(int i =1; i <= 128; i+=i){
            x+=x;
        }
        System.out.println(x);
    }

    public static long getMaximumEvenSum(List<Integer> val) {
        // Write your code here

        int size = val.size();
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + val.get(i);
            if (max_ending_here % 2 == 0) {
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
        }
        return Long.valueOf(max_so_far);
    }
}
