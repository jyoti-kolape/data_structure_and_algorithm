package com.practice.ds.scaler.practice.day22;

import java.util.*;

public class PairWithGivenXOR {
    public static void main(String[] args) {
        Integer[] arr1 = {3, 6, 8, 10, 15, 50};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr1));
        int B = 5;
        System.out.println(solve1(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) == B) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int solve1(ArrayList<Integer> A, int B){
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            int x = A.get(i) ^ B;
            if (set.contains(x)) {
                count++;
                set.remove(x);
            } else {
                set.add(A.get(i));
            }
        }
        return count;
    }
}
