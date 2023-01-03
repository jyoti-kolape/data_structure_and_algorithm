package com.practice.ds.success;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(A.get(A.size()-1)); // last element is always a leader
        int max = A.get(A.size()-1);
        for(int i =A.size()-2;i>=0;i--){
            if(A.get(i)>max){
                ans.add( A.get(i));
                max=A.get(i);
            }
        }
        return ans;
    }
}
