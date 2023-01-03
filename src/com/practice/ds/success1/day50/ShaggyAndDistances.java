package com.practice.ds.success1.day50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistances {
    public static void main(String[] args) {
        Integer[] arr1 = {7, 1, 3, 4, 1, 7};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <  A.size(); i++){
           if(map.containsKey(A.get(i))){
                Integer lastIndex = map.get(A.get(i));
                ans = Math.min(Math.abs(lastIndex - i), ans);
           }else{
               map.put(A.get(i), i);
           }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else {
            return ans;
        }
    }
}
