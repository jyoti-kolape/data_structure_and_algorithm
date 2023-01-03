package com.practice.ds.success1.day50;

import java.util.*;

public class DistinctNumbersWindow {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 1, 3, 4, 3};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(dNums(A, 3));
    }

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        if (n < B)
            return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        int si = 0, ei = 0;
        while (ei < n) {
            map.put(A.get(ei), map.getOrDefault(A.get(ei), 0) + 1);
            ei++;
            if (ei >= B) {
                ans.add(map.size());
                map.put(A.get(si), map.get(A.get(si)) - 1);
                if (map.get(A.get(si)) == 0) {
                    map.remove(A.get(si));
                }
                si++;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> distinctNumbers(ArrayList<Integer> A, int B) {
        if (B > A.size()) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < A.size() - B + 1; i++) {
            Set<Integer> count = new HashSet<>();
            int j = i;
            int n = 0;
            while (n < B) {
                count.add(A.get(j));
                n++;
                j++;
            }
            ans.add(count.size());
        }
        return ans;
    }
}
