package com.practice.ds.scaler;

import java.util.ArrayList;
import java.util.List;

public class BinaryBit {
    public static void main(String args[]) {
        int a = 4, b = 3;
        int x = a & b;
        //System.out.println(x);

        //System.out.println(a|b);

        // System.out.println(4 ^ 3); // = 7

        //System.out.println(4 ^ 7); // = 3

        //System.out.println(3 ^ 7); // = 4
        //int[] A = {2, 8, 3, 1, 2, 2, 3, 2, 8, 1, 1, 1, 8};
        // System.out.println(solve(A));

        //reverse(3l);

        //1 2 3 1 1
        List<Integer> list = new ArrayList<>();
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);*/
        //1000441, 1000441, 1000994
        list.add(1000441);
        list.add(1000441);
        list.add(1000994);

        //int[] list = {1000441, 1000441, 1000994};

        int mE = majorityElement(list);
    }

    public static int solve(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans = ans ^ A[i];
        }
        return ans;
    }

    public static long reverse(long a) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((a & (1 << i)) != 0)
                rev |= 1;
        }
        return rev;
    }

    public static int majorityElement(final List<Integer> a) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < a.size(); i++) {
            if (a.get(maj_index) == a.get(i)) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return majorityElement1(a, a.get(maj_index));
    }

    public static int majorityElement1(List<Integer> A, int cand) {
        int i, count = 0;
        for (i = 0; i < A.size(); i++) {
            if (A.get(i) == cand)
                count++;
        }
        if (count > A.size() / 3)
            return cand;
        else
            return 0;
    }
}
