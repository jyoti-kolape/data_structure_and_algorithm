package com.practice.ds.scaler;

import java.util.ArrayList;

public class MaximumPositivity {

    public static void main(String[] args) {
        //A = [5, 6, -1, 7, 8]

        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(6);
        A.add(-1);
        A.add(7);
        A.add(8);
        ArrayList<Integer> ans = solve(A);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int size = 0, left = 0, right = 0;
        for (int l = -1, r = 0; r < A.size(); r++) {
            if (A.get(r) >= 0) {
                if (size < r - l) {
                    size = r - l;
                    left = l;
                    right = r;
                }
            } else {
                l = r;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = left + 1; i <= right; i++){
            ans.add(A.get(i));
        }
        return ans;
    }
}
