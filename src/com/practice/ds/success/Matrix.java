package com.practice.ds.success;

import java.util.ArrayList;

public class Matrix {
    public ArrayList<ArrayList<Integer>> diagonal1(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int N = A.size();
        for (int col = 0; col < N; col++) {
            int startcol = col, startrow = 0;
            ArrayList<Integer> list1 = new ArrayList<>();
            while (startcol >= 0 && startrow < N) {
                list1.add(A.get(startrow).get(startcol));
                startcol--;
                startrow++;
            }
            int diff = N - startrow;
            for(int i = 1; i <= diff; i++){
                list1.add(0);
            }
            result.add(list1);
        }
        for (int row = 1; row < N; row++) {
            int startrow = row, startcol = N - 1;
            ArrayList<Integer> list2 = new ArrayList<>();
            while (startrow < N && startcol >= 0) {
                list2.add(A.get(startrow).get(startcol));
                startcol--;
                startrow++;
            }
            for(int i = 1; i <= row; i++){
                list2.add(0);
            }
            result.add(list2);
        }
        return result;
    }
    void diagonal(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        for (int col = 0; col < N; col++) {
            int startcol = col, startrow = 0;
            while (startcol >= 0 && startrow < N) {
                 System.out.print(A.get(startrow).get(startcol) + " ");
                 startcol--;
                 startrow++;
            }
            int diff = N - startrow;
            for(int i = 1; i <= diff; i++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
        for (int row = 1; row < N; row++) {
            int startrow = row, startcol = N - 1;
            while (startrow < N && startcol >= 0) {
                System.out.print(A.get(startrow).get(startcol) + " ");
                startcol--;
                startrow++;
            }
            for(int i = 1; i <= row; i++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // matrix initialisation
        //int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        A.add(list1);
        A.add(list2);
        A.add(list3);

        Matrix m = new Matrix();
        m.diagonal(A);
    }
}
