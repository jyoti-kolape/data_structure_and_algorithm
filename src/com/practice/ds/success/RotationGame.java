package com.practice.ds.success;

public class RotationGame {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        int[] C = new int[A.length];
        int index = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            C[index] = A[i];
            index++;
        }

        for(int j = 0; j < B; j++){

        }

        for (int x : C){
            System.out.println(x);
        }

    }
}
