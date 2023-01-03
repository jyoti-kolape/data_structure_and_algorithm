package com.practice.ds.scaler.practice.day45;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        if (A.size() == 0) return -1;
        if (A.size() == 1) return A.get(0);

        if (A.get(0) < A.get(1) && A.get(A.size()-2) < A.get(A.size()-1))
            return A.get(A.size()-1);

        if (A.get(0) > A.get(1) && A.get(A.size()-2) > A.get(A.size()-1))
            return A.get(0);

        int l=0;
        int r=A.size()-1;

        while (l<r) {
            int m = l+(r-l)/2;
            int mvm1 = A.get(m-1);
            int mv = A.get(m);
            int mvp1 = A.get(m+1);

            if (mvm1<=mv && mv>=mvp1) {
                l=r=m;
                break;
            } else if (mvm1<=mv && mv<=mvp1) {
                l = m;
            } else if (mvm1>=mv && mv>=mvp1) {
                r = m;
            } else {
                throw new IllegalStateException("bug!!!");
            }
        }
        return A.get(l);
    }
}
