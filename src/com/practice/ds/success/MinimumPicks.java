package com.practice.ds.success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPicks {
    public static void main(String s[]){
        ArrayList<Integer> A = new ArrayList<>();
        //int[] arr = {-92, 22, 2, 11, 39, 36, 36, 51, 71, 42};
        A.add(-92);
        A.add(22);
        A.add(2);
        A.add(11);
        A.add(39);
        A.add(36);
        A.add(36);
        A.add(51);
        A.add(71);
        A.add(42);
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        int maxEvenNum = Integer.MIN_VALUE;
        int minOddNum = Integer.MAX_VALUE;
        for(int i = 0; i <A.size(); i++){
            if(A.get(i) % 2 == 0 && A.get(i) > maxEvenNum){
                maxEvenNum = A.get(i);
            }else if(A.get(i) % 2 != 0 && A.get(i) < minOddNum){
                minOddNum = A.get(i);
            }
        }
        return maxEvenNum-minOddNum;
    }
}
