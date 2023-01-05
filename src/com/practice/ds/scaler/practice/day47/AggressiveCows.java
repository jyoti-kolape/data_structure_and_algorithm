package com.practice.ds.scaler.practice.day47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AggressiveCows {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A, 2));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int lo = 1, hi = A.get(A.size() - 1) - A.get(0);
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canPlaceCows(A, A.size(), B, mid)) {
                ans = mid;
                lo = mid + 1;
            } else{
                hi = mid - 1;
            }
        }

        return ans;
    }

    static boolean canPlaceCows(ArrayList<Integer> arr, int n, int cows, int dist) {
        int pos = arr.get(0), placedCows = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) - pos >= dist) {
                pos = arr.get(i);
                placedCows++;
            }
            if (placedCows == cows) return true;
        }
        return false;
    }
}
