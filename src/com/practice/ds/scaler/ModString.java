package com.practice.ds.scaler;

public class ModString {
    public static void main(String args[]) {
        System.out.print(findMod("143", 2));
    }

    public static int findMod(String A, int B) {
        int ans = 0;
        int r = 1;
        for (int i = A.length() - 1; i >= 0; i--) {
            int c = A.charAt(i) - '0' % B;
            ans = (ans + (c * r)) % B;
            r = (r * 10) % B;
        }
        return ans;
    }
}
