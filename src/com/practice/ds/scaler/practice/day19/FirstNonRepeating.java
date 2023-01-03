package com.practice.ds.scaler.practice.day19;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 2, 1, 5};
        ArrayList<Integer> stuff = new ArrayList<Integer>(Arrays.asList(A));
        System.out.println(solve(stuff));
    }

    public static int solve(ArrayList<Integer> A) {
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (!map.containsKey(A.get(i))) {
                map.put(A.get(i), 1);
            } else {
                map.put(A.get(i), map.get(A.get(i)) + 1);
            }
        }
        for (int i = 0; i < A.size(); i++) {
            if (map.get(A.get(i)) > 1) {
                ans = A.get(i);
                break;
            }
        }
        return ans;
    }
}
