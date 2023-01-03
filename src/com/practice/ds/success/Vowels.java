package com.practice.ds.success;

public class Vowels {
    public static void main(String agrs[]) {
        System.out.println(Vowels.solve("interviewbit"));
    }
    public static String solve(String A) {
        String vowels ="";
        for(int i=0; i < A.length(); i++){
            if(A.charAt(i) == 'a'|| A.charAt(i) == 'e'|| A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u'){
                vowels = vowels+A.charAt(i);
            }
        }
        return vowels;
    }
}
