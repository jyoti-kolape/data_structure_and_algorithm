package com.practice.ds.success1.day22;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Integer[] arr1 = {100, 4, 200, 1, 3, 2};
        List<Integer> A = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(longestConsecutive(A));
    }

    public static int longestConsecutive(final List<Integer> A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }
        int ans = 0;
        for (Integer value : set) {
            int len = 1, k = 1;
            if (!(set.contains(value - 1))) {
                while (set.contains(value + k)) {
                    len++;
                    k++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}
