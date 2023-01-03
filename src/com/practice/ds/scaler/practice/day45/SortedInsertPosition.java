package com.practice.ds.scaler.practice.day45;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedInsertPosition {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 6};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(searchInsert(A, 7));
    }

    public static int searchInsert(ArrayList<Integer> A, int B) {
        int index = 0;
        index =  binarySearch(A,0,A.size() - 1,B);
        if(index == -1){
            for (int i = 0; i < A.size(); i++){
                if (A.get(i) > B) {
                    break;
                }
                index = i;
            }
        }else{
            return index;
        }
        return index+1;
    }



    private static int binarySearch(ArrayList<Integer> A, int low, int high, int B) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == B) {
                return mid;
            }
            if (A.get(mid) > B) {
                return binarySearch(A, low, mid - 1, B);
            }
            return binarySearch(A, mid + 1, high, B);
        }

        return -1;
    }
}
