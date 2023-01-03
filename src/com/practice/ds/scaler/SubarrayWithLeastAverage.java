package com.practice.ds.scaler;

public class SubarrayWithLeastAverage {

    public static void main(String s[]) {
        int[] A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11}; int B = 9;
        int[] PS = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
            PS[i] = sum;
        }
        float minAvg = Integer.MAX_VALUE, currAvg = 0;
        float bSum = 0; int ans = 0;

        for(int i = 0 ; i <= A.length - B; i++){
            int startInd = i;
            int endInd = i + B-1;
            if(i == 0){
                bSum = PS[endInd];
            }else{
                bSum = PS[endInd] - PS[startInd-1];
            }
            currAvg = bSum/B;
            if(minAvg > currAvg){
                minAvg = currAvg;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
