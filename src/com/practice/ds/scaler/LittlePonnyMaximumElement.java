package com.practice.ds.scaler;

public class LittlePonnyMaximumElement {
    public static int solve(int[] A, int B) {
        int ans = -1;
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                flag = true;
            }
        }
        if (flag) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] > B) {
                    A[j] = -1;
                    count++;
                }
            }
            ans = count;
        }
        return ans;
    }

    public static void main(String agrs[]) {
        /*int[] A = {2, 4, 3, 1, 5};
        int B = 3;*/
        int[] A = {1, 4, 2};
        int B = 3;
        System.out.println(LittlePonnyMaximumElement.solve(A, B));
    }
}
