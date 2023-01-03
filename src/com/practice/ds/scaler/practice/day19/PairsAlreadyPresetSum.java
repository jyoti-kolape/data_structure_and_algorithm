package com.practice.ds.scaler.practice.day19;

import java.util.*;

public class PairsAlreadyPresetSum {
    public static void main(String[] args) {
        Integer[] A = { 3, 4, 2, 6 ,7};
        ArrayList<Integer> stuff = new ArrayList<Integer>(Arrays.asList(A));
        System.out.println(solve(stuff));
    }

    public static int solve(ArrayList<Integer> A) {
        int ans = 0;
        Set<Integer> set = new HashSet<>(A);
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int sum = A.get(i) + A.get(j);
                if (set.contains(sum)) {
                    ans++;
                }
            }
        }
        return ans;
    }

}
