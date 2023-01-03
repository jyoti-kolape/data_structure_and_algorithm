package com.practice.ds.scaler.practice.day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InversionCount {
    public static void main(String[] args) {
        //Integer[] arr1 = {28, 18, 44, 49, 41, 14};
        int[] arr1 = {28, 18, 44, 49, 41, 14};
        //ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(arr1));
    }

    /*public static int solve(ArrayList<Integer> A) {
        int inv_count = 0;
        for (int i = 0; i < A.size() - 1; i++)
            for (int j = i + 1; j < A.size(); j++)
                if (A.get(i) > A.get(j))
                    inv_count++;

        return inv_count;
    }*/
    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length) {
            arr[k] = left[i++];
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j++];
            k++;
        }
        return swaps;
    }

    private static int solve(int[] A) {
        int l = 0;
        int r = A.length-1;
        int count = solve1(A, l, r);
        return (int) (count % (Math.pow(10, 9) +7));
    }

    private static int solve1(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count += solve1(arr, l, m);
            count += solve1(arr, m+1, r);
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

}
