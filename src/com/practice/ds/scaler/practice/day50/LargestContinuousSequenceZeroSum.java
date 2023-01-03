package com.practice.ds.scaler.practice.day50;

import java.util.*;

public class LargestContinuousSequenceZeroSum {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,-2,4,-4};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(lszero(A));
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(A == null) return rst;
        int len = 0;
        int sum = 0;
        int l = -1, r = -1;
        map.put(0, -1);
        for(int i = 0; i < A.size(); i++){
            sum += A.get(i);
            if(!map.containsKey(sum))
                map.put(sum, i);
            else{
                if(i - map.get(sum) > len){
                    l = map.get(sum) + 1;
                    r = i;
                    len = i - map.get(sum);
                }
            }
        }
        if(l >=0 && r >= 0){
            for(int i = l; i <= r; i++){
                rst.add(A.get(i));
            }
        }
        return rst;
    }
}
