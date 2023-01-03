package com.practice.ds.success;

import java.util.ArrayList;

public class RowColumnZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        /*[1,2,3,4]
        [5,6,7,0]
        [9,2,0,4]*/
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(0);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(2);
        list3.add(0);
        list3.add(4);

        A.add(list1);
        A.add(list2);
        A.add(list3);
        RowColumnZero rowColumnZero = new RowColumnZero();

        rowColumnZero.solve(A);

    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        for (int row = 0; row < A.size(); row++) {
            for (int col = 0; col < A.get(row).size(); col++) {
                if (A.get(row).get(col) == 0) {
                    makeColZero(A, col);
                    makeRowZero(A, row);
                }
            }
        }
        return A;
    }

    private void makeRowZero(ArrayList<ArrayList<Integer>> a, int row) {
        ArrayList<Integer> result = a.get(row);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, 0);
        }
        a.set(row, result);
    }

    private void makeColZero(ArrayList<ArrayList<Integer>> a, int col) {
        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> result = a.get(i);
            result.set(col, 0);
            a.set(i, result);
        }
    }
    public ArrayList<ArrayList<Integer>> solve1(ArrayList<ArrayList<Integer>> A){
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<Integer> rowsTBeZero = new ArrayList<>();
        ArrayList<Integer> colsToBeZero = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A.get(i).get(j) == 0) {
                    rowsTBeZero.add(i);
                    colsToBeZero.add(j);
                }
            }
        }
        for (Integer a : rowsTBeZero) {
            for (int i = 0; i < cols; i++) {
                A.get(a).set(i, 0);
            }

        }
        for (Integer a : colsToBeZero) {
            for (int i = 0; i < rows; i++) {
                A.get(i).set(a, 0);
            }

        }
        return A;
    }
}
