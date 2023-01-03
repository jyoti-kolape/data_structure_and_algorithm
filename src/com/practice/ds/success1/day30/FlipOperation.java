package com.practice.ds.success1.day30;

import java.util.ArrayList;

public class FlipOperation {
    public static void main(String[] args) {
        System.out.println(flip("010"));
    }

    public static ArrayList<Integer> flip(String A) {
        ArrayList<Integer> res = new ArrayList<>();
        int arr[] = new int[A.length()];
        for(int i =0; i < A.length(); i++){
            if(A.charAt(i) == '0'){
                arr[i] = 1;
            }if(A.charAt(i) == '1'){
                arr[i] = -1;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int s = 0, e = arr.length;
        for(int i = 0; i < arr.length; i++){
            currentSum = currentSum + arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return res;
    }
}
