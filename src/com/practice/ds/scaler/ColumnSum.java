package com.practice.ds.scaler;

import java.util.ArrayList;

public class ColumnSum {
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int row = 0; row < A.get(0).size(); row++) {
            int sum = 0;
            for (int col = 0; col < A.size(); col++) {
                sum = sum +  A.get(col).get(row);
            }
            result.add(sum);
        }
        return result;
    }

    public static ArrayList<Integer> rowSum(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int row = 0; row < A.size(); row++) {
            int sum = 0;
            for (int col = 0; col <A.get(0).size(); col++) {
                sum = sum +  A.get(row).get(col);
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String s[]) {
        /*[1,2,3,4]
          [5,6,7,8]
          [9,2,3,4]*/
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(8);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(9);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);

        A.add(arrayList1);
        A.add(arrayList2);
        A.add(arrayList3);

        ArrayList<Integer> rr = solve(A);

        rowSum(A);
    }
}
