package com.practice.ds.success1.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class countSubarraysWithSumK {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 0, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A, 1));

    }
    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        HashMap< Integer, Integer > hash = new HashMap < > ();
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A.get(i);
            if (sum == B) {
                count++;
            }
            if (hash.get(sum - B) != null) {
                count += hash.get(sum - B);
            }
            if (hash.get(sum) != null) {
                hash.put(sum, hash.get(sum) + 1);
            } else {
                hash.put(sum, 1);
            }
        }
        return count;
    }
}
