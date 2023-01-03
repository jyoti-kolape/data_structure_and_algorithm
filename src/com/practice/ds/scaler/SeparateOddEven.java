package com.practice.ds.scaler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String s[]) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int[] A = new int[N];
            for (int k = 0; k < N; k++) {
                A[k] = scan.nextInt();
            }
            solve(A);
            System.out.println();
        }
       /* int[] Arr = {905578050, 972494652, 245375028, 878368500, 105860782, 944700823, 490393895, 948966983};
        solve(Arr);*/
    }

    public static void solve(int[] A) {
        List<Integer> evenA = new ArrayList<>();
        List<Integer> oddA = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenA.add(A[i]);
            } else if (A[i] % 2 != 0) {
                oddA.add(A[i]);
            }
        }

        for (int x : oddA) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : evenA) {
            System.out.print(x + " ");
        }
    }
}
