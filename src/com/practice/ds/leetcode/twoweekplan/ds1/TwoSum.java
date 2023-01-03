package com.practice.ds.leetcode.twoweekplan.ds1;

import java.util.TreeMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(twoSum(nums,9));
        TreeMap map = new TreeMap();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = i+1;
        int sum = 0;
        while (i <= nums.length && j <= nums.length){
            sum = nums[i]+nums[j];
            if(sum==target){
                result[0] = i;
                result[1] = j;
            }else{
                j++;
            }
        }
        return result;
    }
}
