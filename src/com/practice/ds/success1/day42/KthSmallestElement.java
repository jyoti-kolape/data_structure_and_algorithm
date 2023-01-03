package com.practice.ds.success1.day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthSmallestElement {
    public static void main(String[] args) {
        Integer[] arr1 = {2, 1, 4, 3, 2};
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(kthsmallest(A, 3));
    }

    public static int kthsmallest(final List<Integer> A, int B) {
        int[] arr  = new int[A.size()];
        for(int i = 0; i< A.size(); i++){
            arr[i] = A.get(i);
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[B - 1];

    }
}
