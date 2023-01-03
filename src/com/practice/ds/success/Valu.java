package com.practice.ds.success;

import java.util.ArrayList;

public class Valu {
    public static void main(String args[]) {
        int[] arr = new int[]{1,1,1};
        int B = 2;
        /*int[] arr = new int[]{1,2,3,2,1};
        int B= 5;*/
        int count = solve(arr, B);
        System.out.println(count);
    }

    public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length-1; i++) {
            for(int j=i+1; j<A.length; j++){
                if (A[i] + A[j] == B) {
                    count++;
                }
            }
        }
        return count;
    }
}
