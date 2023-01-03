package com.practice.ds.success1.day46;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchBitonicArray {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 6, 7, 8, 9, 10, 3, 2, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A, 30));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) == B){
                return i;
            }
        }
        return -1;
    }
}
