package com.practice.ds.success;

public class FindRectangle {
    public static void main(String agrs[]) {
        System.out.println(FindRectangle.solve(1,2,3,4));
    }
    public static int solve(int A, int B, int C, int D) {
        int isRectangle =0;
        if(A==B && C==D){
            isRectangle =1;
        }
        return isRectangle;
    }
}
