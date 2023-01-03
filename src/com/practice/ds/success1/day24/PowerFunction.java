package com.practice.ds.success1.day24;

public class PowerFunction {
    public static void main(String[] args) {

       /* A : 0
        B : 0
        C : 1*/
        //System.out.println(pow(0, 0, 1));
    }

    public static int pow1(int A, int B, int C) {
        if (A == 0 && B == 0) {
            return 0;
        }else if(B==0){
            return 1;
        }
        int halfpow = pow1(A, B / 2, C) % C;
        if (B % 2 == 0) {
            return (halfpow * halfpow);
        } else {
            return (A % C * (halfpow * halfpow) % C) % C;
        }
    }

    public int pow(int A, int B, int C) {
        int ans = (int) pow(A * 1L, B * 1L, C * 1L);
        return ans < 0 ? C + ans : ans;
    }

    long pow(long x, long n, long d) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        long temp = pow(x, n / 2, d) % d;
        if (n % 2 == 0)
            return (temp * temp) % d;
        return (((temp * temp) % d) * x) % d;
    }
}
