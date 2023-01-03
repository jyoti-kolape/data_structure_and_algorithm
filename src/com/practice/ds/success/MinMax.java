package com.practice.ds.success;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static void main(String args[]) {
        List<Integer> A = new ArrayList<>();
        A.add(6);
        A.add(3);
        A.add(9);
        A.add(1);
        A.add(5);
        int min  = A.get(0);
        int max = A.get(0);
        for(int i =0 ; i < A.size(); i++){
           if(min > A.get(i)){
               min = A.get(i);
           }
           if(max < A.get(i)){
               max = A.get(i);
           }
        }
        System.out.println(min+"  "+max);
    }
}
