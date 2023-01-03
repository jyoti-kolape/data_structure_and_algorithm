package com.practice.ds.success;

public class MagicalNumber {
    public static void main(String[] args) {
        System.out.println(solve(3));
    }

    public static int solve(int A) {
        String s = "";
        while (A > 0) {
            s = s + A % 2;
            A = A / 2;
        }
        int magicNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                magicNum = (int) (magicNum + Math.pow(5, i + 1));
            }
        }
        return magicNum;
    }
}
