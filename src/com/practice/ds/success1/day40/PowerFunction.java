package com.practice.ds.success1.day40;

public class PowerFunction {
    public static int pow(int A, int B, int C) {

        long a = A;
        long res = 1L;
        while (B > 0) {
            if (B % 2 == 1) {
                res *= a;
                res %= C;
            }
            a *= a;
            a %= C;
            B = B >> 1;
        }
        res = (res + C) % C;
        return (int) res;
    }
    public static void main(String[] args) {
      System.out.println(pow(2,3,3));
    }
}
