package com.practice.ds.success1.day50;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Integer[] arr1 = {100,4,200,1,3,2};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(longestConsecutive(A));
    }

    public static int longestConsecutive(final List<Integer> A) {
        if(A.size() == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }

        int ans = Integer.MIN_VALUE;

        for (Integer value : set) {
           if(!set.contains(value-1)) {
               int count = 1;
               int y = value+1;
               while(set.contains(y)){
                   count++;
                   y++;
               }
               ans = Math.max(ans, count);
           }
        }
        return ans;
    }
}
