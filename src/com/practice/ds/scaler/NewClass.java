package com.practice.ds.scaler;

import java.util.ArrayList;

public class NewClass {
    public static void main(String args[]) {

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
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
