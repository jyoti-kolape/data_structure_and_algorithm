package com.practice.ds.scaler;

import java.util.ArrayList;

public class MatrixMultiplication {
    public static void main(String s[]) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(4);

        A.add(arrayList1);
        A.add(arrayList2);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);

        B.add(list1);
        B.add(list2);

        solve(A, B);
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A,
                                                      ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int aRowSizeM = A.size();
        int aColSizeN = A.get(0).size();
        int bRowSizeN = B.size();
        int bColSizeP = B.get(0).size();

        for (int i = 0; i < aRowSizeM; i++) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int j = 0; j < bColSizeP; j++) {
                int sum = 0;
                for (int k = 0; k < bRowSizeN; k++) {
                    sum += A.get(i).get(k) * B.get(k).get(j);
                }
                res.add(sum);
            }
            result.add(res);
        }

        return result;
    }
}
