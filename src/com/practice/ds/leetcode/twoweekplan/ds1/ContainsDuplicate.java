package com.practice.ds.leetcode.twoweekplan.ds1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean result = false;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                result = true;
            }else{
                set.add(nums[i]);
            }
        }
        return result;
    }
}
