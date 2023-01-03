package com.practice.ds.success1.bit1;

public class Addition {
    public static void main(String[] args) {
        solve("100", "11");
    }

    public static void solve(String A, String B) {
        String s = "";
        int c = 0;
        int aLen = A.length() - 1, bLen = B.length() - 1;
        while (aLen >= 0 || bLen >= 0) {
            int a, b;
            if(aLen >= 0){
               a  = A.charAt(aLen) - '0';
            }else{
                a = 0;
            }
            if(bLen >= 0){
                b = B.charAt(bLen) - '0';
            }else{
                b = 0;
            }
            int sum = c + a + b;
            int res =  sum % 2;
            c = sum / 2;
            s = s+res;
            aLen--;
            bLen--;
        }
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            result+=s.charAt(i);
        }
        System.out.println(result);
    }
}
