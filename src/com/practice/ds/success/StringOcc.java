package com.practice.ds.success;

import java.util.ArrayList;

public class StringOcc {
    public static void main(String args[]) {

        String A = "aabababaa";
        String B = "ba";
        System.out.println(StringOcc.solve(A, B));
    }
    public static int solve(String A, String B) {
        ArrayList<Integer> arrayList = new ArrayList<>();
         for(int i=0; i<A.length(); i++){
             String s=String.valueOf(A.charAt(i));
             if(B.startsWith(s)){
                if(s.concat(String.valueOf(A.charAt(i+1))).equals(B)){
                    arrayList.add(i+1);
                }
             }
         }

        return arrayList.get(0);
    }
}
