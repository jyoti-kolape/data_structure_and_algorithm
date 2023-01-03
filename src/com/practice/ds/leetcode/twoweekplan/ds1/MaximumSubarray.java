package com.practice.ds.leetcode.twoweekplan.ds1;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int tempSum = Integer.MIN_VALUE; int sum = 0;
        for(int i =0; i < nums.length; i++){
            tempSum = tempSum+nums[i];
            if(tempSum > sum){
                sum = tempSum;
            }
            if(tempSum < 0){
                tempSum = 0;
            }
        }
      return sum;
    }
}
