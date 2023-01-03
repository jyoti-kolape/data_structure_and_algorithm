package com.practice.ds.success;

import java.util.ArrayList;

public class MatricesSame {
    public static void main(String s[]) {

   /*     A :
[
  [1, 2, 3]
  [4, 5, 6]
  [7, 8, 9]
]
        B :
[
  [1, 2, 3]
  [7, 8, 9]
  [4, 5, 6]
]*/
 /*       A :
[
  [34, 2, 82, 39]
  [7, 75, 54, 17]
  [24, 99, 69, 100]
  [97, 90, 21, 88]
  [87, 37, 33, 4]
]
        B :
[
  [34, 2, 82, 39]
  [7, 75, 54, 17]
  [24, 99, 69, 100]
  [97, 90, 21, 88]
  [87, 37, 33, 4]
]*/
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(34);
        arrayList1.add(2);
        arrayList1.add(82);
        arrayList1.add(39);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(7);
        arrayList2.add(75);
        arrayList2.add(54);
        arrayList2.add(17);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(24);
        arrayList3.add(99);
        arrayList3.add(69);
        arrayList3.add(100);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(97);
        arrayList4.add(90);
        arrayList4.add(21);
        arrayList4.add(88);

        ArrayList<Integer> arrayList5 = new ArrayList<>();
        arrayList5.add(87);
        arrayList5.add(37);
        arrayList5.add(33);
        arrayList5.add(4);

        A.add(arrayList1);
        A.add(arrayList2);
        A.add(arrayList3);
        A.add(arrayList4);
        A.add(arrayList5);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(2);
        list1.add(82);
        list1.add(39);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(75);
        list2.add(54);
        list2.add(17);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(24);
        list3.add(99);
        list3.add(69);
        list3.add(100);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(97);
        list4.add(90);
        list4.add(21);
        list4.add(88);

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(87);
        list5.add(37);
        list5.add(33);
        list5.add(4);

        B.add(list1);
        B.add(list2);
        B.add(list3);
        B.add(list4);
        B.add(list5);
        System.out.println(solve(A, B));

    }

    public static int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int result = 0;
        if (A.size() == B.size()) {
            for (int row = 0; row < A.size(); row++) {
                if (A.get(row).size() == B.get(row).size()) {
                    result = 0;
                    for (int col = 0; col < A.get(0).size(); col++) {
                        if (A.get(row).get(col) == B.get(row).get(col)) {
                            result = 1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
        return result;
    }
}
