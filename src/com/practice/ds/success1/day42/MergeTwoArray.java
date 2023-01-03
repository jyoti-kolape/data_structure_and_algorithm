package com.practice.ds.success1.day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {
    public static void main(String[] args) {
        Integer[] arr1 = {4, 7, 9};
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));

        Integer[] arr2 = {2, 11, 19 };
        List<Integer> B = new ArrayList<Integer>(Arrays.asList(arr2));
        System.out.println(solve(A,B));
    }

    public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 =0, p2=0;
        while(p1 < A.size() && p2< B.size()){
            if(A.get(p1) <= B.get(p2)){
                result.add(A.get(p1));
                p1++;
            }else{
                result.add(B.get(p2));
                p2++;
            }
        }
        while(p1< A.size()){
            result.add(A.get(p1));
            p1++;
        }
        while(p2< B.size()){
            result.add(B.get(p2));
            p2++;
        }
        return result;
    }
}
