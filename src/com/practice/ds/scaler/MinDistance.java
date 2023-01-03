package com.practice.ds.scaler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDistance {
    public static void main(String args[]) {
        String a = "x...o.x...o";
        MinDistance minDistance = new MinDistance();
        System.out.println(minDistance.solve(a));
    }

    private int solve(String A) {
        int minDifference = -1;
        List<Integer> xIndex = new ArrayList<>();
        List<Integer> oIndex = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == 'x'){
                xIndex.add(i+1);
            }
            if(A.charAt(i) == 'o'){
                oIndex.add(i+1);
            }
        }
        List<Integer> diffList = new ArrayList<>();
        for(int x : xIndex){
            for (int o : oIndex){
                int diff = Math.abs(x-o);
                diffList.add(diff);
            }
        }
        if(!diffList.isEmpty()){
            Collections.sort(diffList);
            minDifference = diffList.get(0);
        }
        return minDifference;
    }
}
