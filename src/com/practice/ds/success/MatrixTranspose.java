package com.practice.ds.success;

import java.util.ArrayList;

public class MatrixTranspose {
    public static void main(String s[]) {
       /* A :
          [[24, 63, 39, 81, 84, 30]
          [21, 64, 95, 6, 88, 73]
          [33, 6, 63, 96, 86, 66]
          [62, 88, 23, 52, 94, 77]
          [81, 58, 74, 18, 16, 25]
          [26, 40, 88, 64, 72, 23]
          [45, 44, 86, 92, 50, 26]
          [64, 34, 83, 26, 29, 68]
          [43, 42, 7, 17, 45, 52]
          [94, 25, 62, 19, 95, 77]]*/

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

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(11);
        arrayList4.add(12);
        arrayList4.add(13);

        A.add(arrayList1);
        A.add(arrayList2);
        A.add(arrayList3);
        A.add(arrayList4);

        /*ArrayList<ArrayList<Integer>> B = new ArrayList<>();

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
        B.add(list3);*/
        ArrayList<ArrayList<Integer>> result = solve(A);

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int col = 0; col < A.get(0).size(); col++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int row = 0; row < A.size(); row++) {
                subList.add(A.get(row).get(col));
            }
            result.add(subList);
        }
        return result;
    }
}
