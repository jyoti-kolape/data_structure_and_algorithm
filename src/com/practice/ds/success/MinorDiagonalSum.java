package com.practice.ds.success;

import java.util.ArrayList;
import java.util.List;

public class MinorDiagonalSum {
    public static void main(String s[]) {
        List<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(-2);
        list1.add(-3);
       /* list1.add(3);
        list1.add(2);*/
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(-4);
        list2.add(5);
        list2.add(-6);
        /*list2.add(2);
        list2.add(3);*/
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(-7);
        list3.add(-8);
        list3.add(9);
        A.add(list1);
        A.add(list2);
        A.add(list3);
        int sum = solve1(A);
    }

    public static int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        int row = 0;
        int col = A.size() - 1;
        while (row >= 0 && col >=0) {
            sum += A.get(row).get(col);
            row++;
            col--;
        }
        return sum;
    }

    public static int solve1(final List<ArrayList<Integer>> A) {
        int sum = 0;
        int row = 0;
        int col = 0;
        while (row < A.get(0).size() && col < A.size()) {
            sum += A.get(row).get(col);
            row++;
            col++;
        }
        return sum;
    }
}
