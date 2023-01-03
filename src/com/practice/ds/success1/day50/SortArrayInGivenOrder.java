package com.practice.ds.success1.day50;

import java.util.*;

public class SortArrayInGivenOrder {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));

        Integer[] arr2 = {5, 4, 2};
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(arr2));

        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
       HashMap<Integer, Integer> map = new HashMap<>();
       Set<Integer> set = new HashSet<>();
       for(int i = 0; i < A.size(); i++){
           set.add(A.get(i));
       }
        for(int i = 0; i < B.size(); i++){
            set.add(B.get(i));
        }
       for(int i = 0; i < A.size(); i++){

       }
        return A;
    }
}
