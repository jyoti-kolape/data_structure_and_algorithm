package com.practice.ds.success;

import java.util.ArrayList;

public class SpiralOrderMatrix {
    public static void main(String s[]) {

        System.out.println(generateMatrix(5));
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j <= A; j++) {
                list.add(0);
            }
            ans.add(list);
        }
        int value = 1, row = 0, col = 0;
        int dir = 1;
        while (value <= A * A) {
            if (dir == 1) {
                ArrayList<Integer> list = ans.get(row);
                while (row < A && col < A) {
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        value++;
                        col++;
                    } else {
                        break;
                    }
                }
                ans.set(row, list);
                row++;
                col--;
                dir = 2;
            }
            if (dir == 2) {
                while (row < A && col < A) {
                    ArrayList<Integer> list = ans.get(row);
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        ans.set(row, list);
                        value++;
                        row++;
                    } else {
                        break;
                    }
                }
                col--;
                row--;
                dir = 3;
            }
            if (dir == 3) {
                ArrayList<Integer> list = ans.get(row);
                while (row < A && col < A && col >= 0) {
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        value++;
                        col--;
                    } else {
                        break;
                    }

                }
                ans.set(row, list);
                row--;
                col++;
                dir = 4;
            }
            if (dir == 4) {
                while (row < A && row > 0) {
                    ArrayList<Integer> list = ans.get(row);
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        ans.set(row, list);
                        value++;
                        row--;
                    } else {
                        break;
                    }
                }
                row++;
                col++;
                dir = 1;
            }
        }
        return ans;
    }
}
