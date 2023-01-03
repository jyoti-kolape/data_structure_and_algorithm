package com.practice.ds.success;

public class Lengthoflongestconsecutiveones {
    public static void main(String[] args) {
        String s = "111011101";
        System.out.println(maximum_one(s));
    }

    public static int maximum_one(String A) {
        int cnt_one = 0;
        int max_cnt = 0, temp = 0;
        int n = A.length();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                cnt_one++;
                temp++;
            } else {
                max_cnt = Math.max(max_cnt, temp);
                temp = 0;
            }
        }
        max_cnt = Math.max(max_cnt, temp);

        int[] left = new int[n];
        int right[] = new int[n];

        if (A.charAt(0) == '1')
            left[0] = 1;
        else
            left[0] = 0;

        if (A.charAt(n - 1) == '1')
            right[n - 1] = 1;
        else
            right[n - 1] = 0;

        for (int i = 1; i < n; i++) {
            if (A.charAt(i) == '1')
                left[i] = left[i - 1] + 1;
            else
                left[i] = 0;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (A.charAt(i) == '1')
                right[i] = right[i + 1] + 1;
            else
                right[i] = 0;
        }

        for (int i = 1; i < n - 1; i++) {
            if (A.charAt(i) == '0') {
                int sum = left[i - 1] + right[i + 1];
                if (sum < cnt_one)
                    max_cnt = Math.max(max_cnt, sum + 1);
                else
                    max_cnt = Math.max(max_cnt, sum);
            }
        }
        return max_cnt;
    }
}
