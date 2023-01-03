package com.practice.ds.success1.day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumOfContiguousArray {
    public static void main(String[] args) {
        Integer[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(maxSubArray(A));
    }

    public static int maxSubArray(final List<Integer> A) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < A.size(); i++) {

            max_ending_here = max_ending_here + A.get(i);

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
