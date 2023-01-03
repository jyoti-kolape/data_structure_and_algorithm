package com.practice.ds.success;

import java.util.ArrayList;

public class SumAllSubArray {

    public static void main(String s[]) {
        int[] A = {2, 1, 3};
        System.out.println(sumSubArray(A));
    }

    public static long sumSubArray(int[] A) {
        int N = A.length;

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + (A[i] * i+1 * N-i);
        }
        return sum;
    }

    public static long subArray(int[] ps, int s, int e) {
        if(s == 0 && e == 0){
          return  ps[e];
        }else if(s == 0){
            return  ps[e];
        }else{
            return ps[e] - ps[s-1];
        }
    }
    /*public Long subarraySum(ArrayList<Integer> A) {
        int N = A.size();
        long sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                sum = sum + subArray(A, i, j);
            }
        }
        return sum;
    }*/
    public Long subarraySum(ArrayList<Integer> A) {
        Long sum = 0l;
        for (int i = 0; i < A.size(); i++) {
            sum += (A.get(i) * (i + 1) * (A.size() - i));
        }
        return sum;
    }
}

