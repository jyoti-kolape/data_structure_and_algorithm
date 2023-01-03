package com.practice.ds.scaler.practice.day51;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (map.containsKey(A.get(i))) {
                map.put(A.get(i), map.get(A.get(i)) + 1);
            } else {
                map.put(A.get(i), 1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            if (map.containsKey(B.get(i))) {
                if (map.get(B.get(i)) - 1 == 0) {
                    map.remove(B.get(i));
                } else {
                    map.put(B.get(i), map.get(B.get(i)) - 1);
                }
                ans.add(B.get(i));
            }
        }
        return ans;
    }
}
