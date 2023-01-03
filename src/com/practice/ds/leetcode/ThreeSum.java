package com.practice.ds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int i = 0, j = 0, k = 0;

        /*int target = 0 - (nums[i] + nums[i + 1]);
        if (hashMap.containsKey(target)) {
            if (hashMap.get(target) > 0) {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(nums[i]);
                innerList.add(nums[i + 1]);
                innerList.add(target);
                int value = hashMap.get(target);
                hashMap.put(target, value - 1);
                ans.add(innerList);
            }
        } else {
            hashMap.put(target, 1);
        }*/
        return ans;
    }
}
