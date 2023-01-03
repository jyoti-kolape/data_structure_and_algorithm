package com.practice.ds.success1.day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumOfAubArray {
    public static void main(String[] args) {
        Integer[] arr1 = {-2, 3, 4, -1, 5, -10, 7};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(maxSubArray1(A));
    }

    public static int maxSubArray(List<Integer> A) {
        int maxSum = A.get(0);
        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            for (int j = i; j < A.size(); j++) {
                sum = sum + A.get(j);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static int maxSubArray1(List<Integer> A) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0; i < A.size(); i++){
            currentSum = currentSum + A.get(i);
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
