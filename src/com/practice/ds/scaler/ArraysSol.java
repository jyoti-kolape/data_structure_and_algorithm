package com.practice.ds.scaler;

import java.util.Arrays;

public class ArraysSol {
    public int[] solve(int[] A, int[] B) {
        int[] arr = new int[A.length];
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                arr[i] = A[i];
                i++;
                j++;
            }else if (A[i] < B[j])
                i++;
            else
                j++;
        }
        int k = 0;
        for (int x : arr){
            if(x!=0){
                System.out.println(x);
                arr[k] = x;
            }
            k++;
        }
        return arr;
    }
    public static void main(String args[]){
         int[] A = {1,2,2,1};
         int[] B = {2,3,1,2};
         ArraysSol arraysSol = new ArraysSol();
         /*String str = "abs"+123+"eee";
         String str1 = 12345+"122457"+123+"eee";
        System.out.println(str1);*/
         System.out.println(arraysSol.solve(A, B));
    }
}
