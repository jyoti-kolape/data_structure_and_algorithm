package com.practice.ds.scaler.practice.day24;

import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(grayCode(2));
    }

    public static ArrayList<Integer> grayCode(int a) {

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int i = 0; i < a; i++) {
            int msb = 1 << i;
            int size = ans.size();
            for (int j = size - 1; j >= 0; j--) {
                int num = ans.get(j) | msb;
                ans.add(num);
            }
        }
        return ans;
    }
}
