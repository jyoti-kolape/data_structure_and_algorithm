package com.practice.ds.success1.day19;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 2, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));

        Integer[] arr2 = {2, 3, 1, 2};
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(arr2));
        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (map1.containsKey(A.get(i))) {
                map1.put(A.get(i), map1.get(A.get(i)) + 1);
            } else {
                map1.put(A.get(i), 1);
            }
        }
        for (int i = 0; i < B.size(); i++) {
            if (map2.containsKey(B.get(i))) {
                map2.put(B.get(i), map2.get(B.get(i)) + 1);
            } else {
                map2.put(B.get(i), 1);
            }
        }

        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            arr.add(A.get(i));
        }

        for (Integer value : arr) {
            if (map1.get(value) == map2.get(value)) {
                for (int j = 0; j < map1.get(value); j++) {
                    ans.add(value);
                }
            } else if (map1.containsKey(value) && map2.containsKey(value)) {
                int minValue = Math.min(map1.get(value), map2.get(value));
                for (int j = 0; j < minValue; j++) {
                    ans.add(value);
                }
            }
        }
        return ans;
    }
}
