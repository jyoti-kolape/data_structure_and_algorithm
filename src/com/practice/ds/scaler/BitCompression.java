package com.practice.ds.scaler;

import java.util.ArrayList;

public class BitCompression {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(5);
        int ans = 0;
        for (int i = 0; i < A.size(); i++) {
            ans ^= A.get(i);
        }
        System.out.println(ans);
    }


}
