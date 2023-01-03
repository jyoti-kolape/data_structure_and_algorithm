package com.practice.ds.scaler.practice.day18;

import java.util.ArrayList;

public class SortByColor {
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
        //0 1 2 0 1 2
        A.add(0);
        A.add(1);
        A.add(2);
        A.add(0);
        A.add(1);
        A.add(2);
        System.out.println(sortColors(A));

    }

    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int x : A) {
            if (x == 0) {
                count0++;
            } else if (x == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        A.clear();
        for (int i = 0; i < count0; i++) {
            A.add(0);
        }
        for (int i = 0; i < count1; i++) {
            A.add(1);
        }
        for (int i = 0; i < count2; i++) {
            A.add(2);
        }
        return A;
    }
}
