package com.practice.ds.general;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public static void main(String[] args) {
        Integer[] arr1 = {7,2,6,5};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(combinationSum(A, 16));
    }

    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        // add your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        return combinationSum1(A, B, 0, result);
    }

    static ArrayList<ArrayList<Integer>> combinationSum1(ArrayList<Integer> A, int B, int sum, ArrayList<ArrayList<Integer>> result){
        if(sum == B){

        }
        ArrayList<Integer> subResult = null;
        for(int i = 0; i < A.size(); i++){
            subResult = new ArrayList<>();
            sum = sum + A.get(i);
            if(isSafe(sum, B)){
                combinationSum1(A, B, sum, result);
            }else{
                sum = sum - A.get(i);
            }
            subResult.add(A.get(i));
        }
        result.add(subResult);
        return result;
    }

    static boolean isSafe(int sum, int B) {
        if(sum <= B){
            return true;
        }else{
            return false;
        }
    }
}
