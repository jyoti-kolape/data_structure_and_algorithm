package com.practice.ds.success;

public class PrefixSum {

    public static void main(String s[]) {
        int[] A = {1, 1, 1};
        int[] ePS = new int[A.length];
        int[] oPS = new int[A.length];
        int eSum = 0, oSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                eSum = eSum + A[i];
                ePS[i] = eSum;
            } else {
                ePS[i] = eSum;
            }
            if (i % 2 != 0) {
                oSum = oSum + A[i];
                oPS[i] = oSum;
            } else {
                oPS[i] = oSum;
            }
        }
        int beforeEvenSum = 0, afterEvenSum = 0, beforeOddSum = 0, afterOddSum = 0, count = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                beforeEvenSum = 0;
                beforeOddSum = 0;
            } else {
                beforeEvenSum = ePS[i - 1];
                beforeOddSum = oPS[i - 1];
            }
            afterEvenSum = ePS[A.length - 1] - ePS[i];
            afterOddSum = oPS[A.length - 1] - oPS[i];
            int totalEven = beforeEvenSum + afterOddSum;
            int totalOdd = beforeOddSum + afterEvenSum;
            if (totalEven == totalOdd) {
                count++;
            }

        }
        System.out.println(count);
    }
}
