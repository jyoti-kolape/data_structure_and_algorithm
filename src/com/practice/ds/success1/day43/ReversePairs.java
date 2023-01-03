package com.practice.ds.success1.day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ReversePairs {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 2, 3, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
       // A[i] > 2*A[j]
        /*int count = 0 ;
        for(int i = 0; i < A.size()-1; i++){
            for(int j = i+1; j<A.size(); j++){
                if(A.get(i) > 2*A.get(j)){
                    count = count +1;
                }
            }
        }
        return count;*/

        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        int[] sorted = new int[A.size()];
        int[] bit = new int[A.size() + 1];
        for (int i = 0; i < A.size(); i ++) {
            sorted[i] = A.get(i);
        }
        Arrays.sort(sorted);
        for (int i = 0; i < sorted.length; i ++) {
            index.put(sorted[i], i + 1);
        }
        int res = 0;
        for (int i = A.size() - 1; i >= 0; i --) {
            int j = index(sorted, (double) A.get(i)/2.0);
            int tmp = getSum(bit,j);
            res += tmp;
            update(bit, index.get(A.get(i)));
        }
        return res;
    }
    private static int getSum(int[] bit, int i) {
        int res = 0;
        while (i > 0) {
            res += bit[i];
            i -= (i&(-i));
        }
        return res;
    }
    private static void update(int[] bit, int i) {
        while (i < bit.length) {
            bit[i] ++;
            i += (i&(-i));
        }
    }
    private static int index(int[] sorted, double val) {
        int left = 0, right = sorted.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (sorted[mid] >= val) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return right + 1;
    }
}
