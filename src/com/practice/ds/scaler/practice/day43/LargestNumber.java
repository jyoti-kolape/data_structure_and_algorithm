package com.practice.ds.scaler.practice.day43;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Integer[] arr1 = {3, 30, 34, 5, 9};
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(largestNumber(A));
    }

    public static String largestNumber(final List<Integer> A) {
        String[] arr = new String[A.size()];
        for (int i = 0; i < A.size(); i++) {
            arr[i] = String.valueOf(A.get(i));
        }
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        if(sb.charAt(0) == '0'){
            return String.valueOf(0);
        }
        return sb.toString();

    }

}
