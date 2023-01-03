package com.practice.ds.scaler.practice.day18;

import java.util.ArrayList;
import java.util.Collections;

public class NobelIntegers {
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
       /* A.add(3);
        A.add(2);
        A.add(1);
        A.add(3);*/
        //6, 7, 5
        A.add(3);
        A.add(2);
        A.add(1);
        A.add(3);
        System.out.println(solve(A));

    }

    //Given an integer array A, find if an integer p exists in the array
    // such that the number of integers greater than p in the array equals to p.
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int flag = -1;
        int j = 0;
        for (int i = 0; i < A.size(); i++) {
            j = 1;
            for (j = i; j < A.size(); j++) {
                if (A.get(i) != A.get(j))
                    break;
            }
            if (A.get(i) == A.size() - j) {
                flag = 1;
                break;
            }
        }
        return flag;
    }
}
