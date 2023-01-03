package com.practice.ds.success;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            Long[] A = new Long[N];
            for (int k = 0; k < N; k++) {
                A[k] = scan.nextLong();
            }
            System.out.println(getSecondLargestElement(A));
        }

    }

    public static long getSecondLargestElement(Long[] A) {
        long first, second;
        first = second = A[0];
        if(A == null || A.length < 2){
            return -1;
        }else{
            for (int i = 0; i < A.length; i++) {
                if (A[i] > first) {
                    second = first;
                    first = A[i];
                } else if (A[i] > second && A[i] != first) {
                    second = A[i];
                }
            }
            return second;
        }
    }
}
