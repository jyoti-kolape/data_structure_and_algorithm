package com.practice.ds.success1.day36;

import java.util.ArrayList;

public class PairSumDivisibleByM {

    /*public static int solve(ArrayList<Integer> A, int B) {

        int freq[] = new int[K];

        // Count occurrences of all remainders
        for (int i = 0; i < n; i++)
            ++freq[A[i] % K];

        // If both pairs are divisible by 'K'
        int sum = freq[0] * (freq[0] - 1) / 2;

        // count for all i and (k-i)
        // freq pairs
        for (int i = 1; i <= K / 2 && i != (K - i); i++)
            sum += freq[i] * freq[K - i];
        // If K is even
        if (K % 2 == 0)
            sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);
        return sum;
    }*/

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(17);
        arr.add(100);
        arr.add(11);
        // arr.add(5);
       // System.out.println(solve(arr, 28));
    }
}
