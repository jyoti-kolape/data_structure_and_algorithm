package com.practice.ds.success1.day24;

import java.util.ArrayList;
import java.util.List;

public class MatrixConnection {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(0);
        list1.add(0);
        list1.add(1);

        list2.add(0);
        list2.add(1);
        list2.add(1);
        list2.add(1);

        list3.add(1);
        list3.add(0);
        list3.add(0);
        list3.add(1);

        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);

        System.out.println(count(matrix));

    }

    public static int count(List<List<Integer>> matrix) {

        int count = 0;
        int m = matrix.size();
        int n = matrix.get(0).size();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix.get(i).get(j) == 1) {
                    if (i - 1 >= 0 && j - 1 >= 0 && matrix.get(i - 1).get(j - 1) == 1) {
                        count = count + 1;

                    }
                    if (i - 1 >= 0 && matrix.get(i - 1).get(j) == 1) {
                        count = count + 1;
                    }
                    if (i - 1 >= 0 && j + 1 < n && matrix.get(i - 1).get(j + 1) == 1) {
                        count = count + 1;
                    }
                    if (j + 1 < n && matrix.get(i).get(j + 1) == 1) {
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }
}
