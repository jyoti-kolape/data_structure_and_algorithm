package com.practice.ds.success;

import java.net.Inet4Address;
import java.util.ArrayList;

public class ABC {

    public static void main(String agrs[]) {
        ArrayList < Integer > A = new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(4);
        A.add(6);
        ArrayList < Integer > B = new ArrayList<>();
        B.add(20); B.add(4); B.add(10); B.add(2);
        System.out.println(ABC.solve1(A,B));
        //ABC.solve(new int[]{3, 4, 4, 6}, new int[]{20, 4, 10, 2});
    }

    public static int[] solve(int[] A, int[] B) {
        int[] arr = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int money = B[i];
            int sum = 0;
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                sum = sum + A[j];
                if (money > sum) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
    public static ArrayList < Integer > solve1(ArrayList < Integer > A, ArrayList < Integer > B) {

        ArrayList < Integer > ans = new ArrayList < Integer > ();
        int tot = 0;
        for (int i = 0; i < A.size(); i++) {
            if (i != 0) {
                A.set(i, A.get(i) + A.get(i - 1));
            }
        }
        for (int i = 0; i < B.size(); i++) {
            int cnt = binarySearch(A, B.get(i));
            ans.add(cnt);

        }

        return ans;
    }

    static int binarySearch(ArrayList < Integer > A, int val) {
        int l = 1, h = A.size(), ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (A.get(mid - 1) > val) {
                h = mid - 1;
            } else {
                l = mid + 1;
                ans = mid;
            }
        }

        return ans;
    }
}
