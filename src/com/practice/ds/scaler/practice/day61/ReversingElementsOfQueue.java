package com.practice.ds.scaler.practice.day61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReversingElementsOfQueue {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 17, 100, 11};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A, 2));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = B-1; i >= 0; i--) {
            queue.add(A.get(i));
            A.set(i, 0);
        }
        for(int i = 0; i < B; i++){
            A.set(i, queue.remove());
        }

        return A;
    }
}
