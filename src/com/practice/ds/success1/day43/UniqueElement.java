package com.practice.ds.success1.day43;

import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 1, 3};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
       /*Collections.sort(A);
       int steps = 0;
       for(int i = 1; i < A.size(); i++){
           if(A.get(i) == A.get(i-1)){
               A.set(i, A.get(i)+1);
               steps++;
           }
           if(A.get(i-1) > A.get(i) ){
               A.set(i, A.get(i-1)+1);
               steps=steps+2;
           }

       }
        return steps;*/
        Collections.sort(A);
        int step = 0;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) <= A.get(i-1)) {
                step += A.get(i-1) - A.get(i) + 1;
                A.set(i, A.get(i-1)+1);
            }
        }
        return step;
    }
}
