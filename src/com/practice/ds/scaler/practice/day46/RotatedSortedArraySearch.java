package com.practice.ds.scaler.practice.day46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        Integer[] arr1 = {1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(search(A, 1));
    }

    public static int search(final List<Integer> A, int B) {
        int result = -1;
        for(int i =0; i < A.size(); i++){
            if(A.get(i) == B){
                result = i;
            }
        }
        return result;
    }
}
