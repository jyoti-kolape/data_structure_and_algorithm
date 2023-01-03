package com.practice.ds.success;

import java.util.ArrayList;

public class EquilibriumIndex {

    public static void main(String agrs[]) {
        //-7, 1, 5, 2, -4, 3, 0
        ArrayList<Integer> A = new ArrayList<>();
       /* A.add(-7);
        A.add(1);A.add(5);
        A.add(2);
        A.add(-4);
        A.add(3);A.add(0);*/

        A.add(1);
        A.add(2);A.add(3);
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {

        int lSum=0, rSum=0, index=-1 ;
        for (int i = 0; i < A.size(); i++) {
             lSum = 0;
            for (int e = i+1; e < A.size(); e++){
                lSum = lSum+A.get(e);
            }
             rSum = 0;
            for(int s = i-1; s >=0; s--){
                rSum = rSum+A.get(s);
            }
            if(lSum == rSum){
                index = i;
                break;
            }

        }
        return index;
    }
}
