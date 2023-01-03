package com.practice.ds.success;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContiguousSubarray {

    public static void main(String s[]) {
        //A = [1, 2, 3, 4, -10]

        List<Integer> list = new ArrayList<>();
        //list.add(1);list.add(2);list.add(3);list.add(4);list.add(10);
        //-2, 1, -3, 4, -1, 2, 1, -5, 4
        list.add(-2);
        list.add(1);
        list.add(-3);
        list.add(4);
        list.add(-1);
        list.add(2);
        list.add(1);
        list.add(-5);
        list.add(4);
        System.out.println(maxSubArray(list));

        //int[] A = {2, 1, 3};
        //System.out.println(sumSubArray(list));
    }

    public static long maxSubArray(List<Integer> A) {
        int N = A.size();
        int[] ps = new int[N];
        int psSum = 0;
        for (int i = 0; i < N; i++) {
            psSum = psSum + A.get(i);
            ps[i] = psSum;
        }

        long sum = Integer.MIN_VALUE, currSum = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sum = subArray(ps, i, j);
                if(sum  > currSum){
                    currSum = sum;
                }
            }
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
}
