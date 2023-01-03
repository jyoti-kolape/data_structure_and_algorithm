package com.practice.ds.scaler.practice.day22;

import java.util.*;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 1, 2, 2};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        int B = 1;
        System.out.println(dNums1(A, B));
    }

    private static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i <= A.size() - B) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < B + i; j++) {
                set.add(A.get(j));
            }
            ans.add(set.size());
            i++;
        }
        return ans;
    }

    private static ArrayList<Integer> dNums1(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B; i++) {
            if (map.containsKey(A.get(i))) {
                map.put(A.get(i), map.get(A.get(i)) + 1);
            } else {
                map.put(A.get(i), 1);
            }
        }
        for (int i = 0; i < A.size() - B; i++) {
            ans.add(map.size());
            map.put(A.get(i), map.get(A.get(i)) - 1);
            if (map.get(A.get(i)) == 0) {
                map.remove(A.get(i));
            }

            if (map.containsKey(A.get(i + B))) {
                map.put(A.get(i + B), map.get(A.get(i + B)) + 1);
            } else {
                map.put(A.get(i + B), 1);
            }
        }
        ans.add(map.size());
        return ans;
    }
}
