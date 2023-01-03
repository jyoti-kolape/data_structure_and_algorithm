package com.practice.ds.leetcode.Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ints = twoSum(nums, 9);
        System.out.print("[");
        for(int index : ints){
            System.out.print(" "+index+" ");
        }
        System.out.print("]");
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = new int[2];
        int value;
        for (int i = 0; i < nums.length; i++) {
            value = target - nums[i];
            if(hashMap.containsKey(value)){
                arr[0]= hashMap.get(value);
                arr[1] = i;
                return arr;
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return null;
    }
}
