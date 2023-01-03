package com.practice.ds.scaler.practice.day16;

public class ToggleEachCase {
    public static void main(String[] args) {
        System.out.println(solve("FbxdWdoKwrezJPP"));
    }

    public static String solve(String A) {
        char[] str = A.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            str[i] = (char) (str[i] ^ 32);
           /* if (str[i] >= 'a' && str[i] <= 'z') {
                str[i] -= Math.abs('a' - 'A');
            } else {
                str[i] += Math.abs('a' - 'A');
            }*/
        }
        return new String(str);
    }
}
