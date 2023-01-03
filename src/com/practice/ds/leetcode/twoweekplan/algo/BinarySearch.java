package com.practice.ds.leetcode.twoweekplan.algo;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = (start + end) / 2;
        int index = -1;
        if (nums[mid] == target) {
            index = mid;
        }
        if (nums[mid] < target) {
            for (int i = mid + 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    index = i;
                }
            }
        } else {
            for (int i = start; i < mid; i++) {
                if (nums[i] == target) {
                    index = i;
                }
            }
        }
        return index;
    }
}
