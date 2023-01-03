package com.practice.ds.scaler.practice.day22;

import java.util.*;

public class DiffkII {
    public static void main(String[] args) {
        Integer[] arr1 = {34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33, 70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13, 93, 15, 43, 73, 68, 29};
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        int B = 97;
        System.out.println(diffPossible(A, B));
    }

    public static int diffPossible(final List<Integer> A, int B) {
       /* Set<Integer> arr = new HashSet<>();
        int iValue = 0, jValue = 0;
        for(int i = 0; i < A.size(); i++){
            if(arr.contains(Math.abs(B-A.get(i)))){
               return 1;
            }else{
                arr.add(A.get(i));
            }
        }
        return 0;*/
        if (A.size() <= 1) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            if (set.contains(num + B) || set.contains(num - B)) {
                return 1;
            }
            set.add(num);
        }
        return 0;
    }
}
