package com.practice.ds.scaler.practice.general;

// Check if sum of left half or array is equal to sum of right half or array where size in even.

public class Example {

    public static void main(String[] args) {

        int[] A = {5,5,7,7};
        solve(A.length, A);

    }
    public static void solve(int N, int[] A){
        int sumRight = 0;
        int sumLeft=0;
        for (int posFromLeft=0; posFromLeft < N; posFromLeft++){
            int posFromRight=N-posFromLeft-1;
            if (posFromRight > posFromLeft){
                sumRight+=A[posFromRight];
                sumLeft+=A[posFromLeft];
            }
        }
        System.out.println("right sum: "+sumRight);
        System.out.println("left sum: "+sumLeft);
    }
    /*public static String solve(int N, int[] A){
        int sumTotal = 0;
        for(int i =0; i < N; i++){
            sumTotal = sumTotal+A[i];
        }

        int sumRight = 0;
        int sumLeft = 0;
        for(int i = 1; i< N-1; i++){
            sumLeft = sumLeft + A[i-1];
            sumRight = sumTotal - A[i]- sumLeft;
            if(sumLeft == sumRight){
                return "YES";
            }
        }
        return"NO";
    }*/
}
