package com.practice.ds.scaler;

import java.util.ArrayList;

public class MatrixSubtraction {
    public static void main(String s[]) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(7);
        arrayList3.add(8);
        arrayList3.add(9);

        A.add(arrayList1);
        A.add(arrayList2);
        A.add(arrayList3);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(8);
        list1.add(7);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(4);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(2);
        list3.add(1);

        B.add(list1);
        B.add(list2);
        B.add(list3);
        ArrayList<ArrayList<Integer>> result = solve(A,B);

    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A,
                                               ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int row = 0; row < A.size(); row++) {
            int sub = 0;
            ArrayList<Integer> res = new ArrayList<>();
            for (int col = 0; col < A.get(0).size(); col++) {
                int aVal = A.get(row).get(col);
                int bVal = B.get(row).get(col);
                sub = aVal - bVal;
                res.add(sub);
            }
            result.add(res);
        }
        return result;
    }
}
