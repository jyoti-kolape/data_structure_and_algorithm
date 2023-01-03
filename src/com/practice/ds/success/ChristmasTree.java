package com.practice.ds.success;

import java.util.ArrayList;

public class ChristmasTree {
    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int ans = Integer.MAX_VALUE;
        for (int j = 1; j < A.size(); j++) {
            int tempSum = B.get(j), iVal = Integer.MAX_VALUE, kVal = Integer.MAX_VALUE;
            for (int i = j - 1; i >= 0; i--) {
                if (A.get(i) < A.get(j) && B.get(i) < iVal) {
                    iVal = B.get(i);
                }
            }
            for (int k = j + 1; k < A.size(); k++) {
                if (A.get(k) > A.get(j) && B.get(k) < kVal) {
                    kVal = B.get(k);
                }
            }
            if (iVal != Integer.MAX_VALUE && kVal != Integer.MAX_VALUE) {
                tempSum = tempSum + iVal + kVal;
                ans = Math.min(ans, tempSum);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}
