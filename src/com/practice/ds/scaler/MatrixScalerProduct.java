package com.practice.ds.scaler;

import java.util.ArrayList;

public class MatrixScalerProduct {
    public static void main(String s[]) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(7);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(10);

        A.add(arrayList1);
        A.add(arrayList2);

        int B = 4;

        ArrayList<ArrayList<Integer>> result = solve(A, B);

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int row = 0; row < A.size(); row++) {
            ArrayList<Integer> subAns = new ArrayList<>();
            for (int col = 0; col < A.get(0).size(); col++) {
                subAns.add(B * (A.get(row).get(col)));
            }
            ans.add(subAns);
        }
        return ans;
    }
}

