package com.practice.ds.scaler.practice.day30;

import java.util.ArrayList;

public class Flip {
    public static void main(String[] args) {
        System.out.println(flip("010"));
    }

    public static ArrayList<Integer> flip(String A) {
        ArrayList<Integer> res = new ArrayList<>();
        int bestStart = -1;
        int bestEnd = -1;

        int start = 0;
        int flipSum = 0;
        int bestSum = 0;
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '0') {
                flipSum++;
            } else {
                flipSum--;
            }
            if (flipSum > bestSum && i >= start) {
                bestStart = start;
                bestEnd = i;
                bestSum = flipSum;
            } else if (flipSum < 0) {
                start = i + 1;
                flipSum = 0;
            }
        }

        if (bestStart != -1) {
            res.add(bestStart + 1);
            res.add(bestEnd + 1);
        }
        return res;
    }
}
