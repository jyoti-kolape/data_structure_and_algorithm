package com.practice.ds.success;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatMissingNumberArray {
    public static void main(String args[]) {

        List<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(3);

        ArrayList<Integer> ans = repeatedNumber(A);

    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (Integer i : A) {
            if (hashMap.get(i) == null) {
                hashMap.put(i, true);
            } else {
                ans.add(i);
            }
        }
        for (int i = 1; i <= A.size(); i++) {
            if (hashMap.get(i) == null) {
                ans.add(i);
            }
        }
        return ans;
    }
}
