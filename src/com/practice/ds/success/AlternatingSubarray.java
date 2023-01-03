package com.practice.ds.success;

import java.util.ArrayList;

public class AlternatingSubarray {
    public static void main(String[] args) {
       /* A = [1, 0, 1, 0, 1]
        B = 1*/
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(1);
        solve(A, 1);

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int n = A.size();
        int len = 2 * B + 1;
        for (int i = 0; i < n - len + 1; i++) {
            int curr = -1;
            int flag = 1;
            for (int j = i; j < i + len; j++) {
                if (A.get(j) == curr) {
                    flag = 0;
                    break;
                }
                curr = A.get(j);
            }
            if (flag == 1) {
                l1.add(i + B);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            res.add(l1.get(i));
        }
        return res;
    }
}
