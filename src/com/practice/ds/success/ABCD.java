package com.practice.ds.success;

public class ABCD {
    public static void main(String args[]) {
        int[] A = {};
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 1){
                count++;
            }else if(A[i] == 0 && A[i+1] !=0){
                count = count+1;
            }
        }
    }
}
