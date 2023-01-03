package com.practice.ds.scaler;

import java.util.*;

public class StringPrefix {
    public int[] solve(String[] A, String B) {
        int[] arr = new int[2];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<A.length;i++){
            if(A[i].length() >= B.length()){
                if(A[i].startsWith(B)){
                    list.add(i);
                }
            }
        }
        if(!list.isEmpty()){
            arr[0]= list.get(0);
            arr[1] = list.get(list.size()-1);
        }else{
            arr[0] = -1;
            arr[1] = -1;
        }

        return arr;
    }
    public static void main(String agrs[]){
       /* String[] C = { "aa", "aaab", "ab", "b" };
        String D = "b";
        String[] A = {"a", "aa", "aab", "b", "bb", "bba", "bbb"};
        String B = "bb";
        String[] P = { "aaaaa", "ba", "baa", "baabb", "bb" };
        String Q = "ab";
        StringPrefix stringPrefix = new StringPrefix();
        System.out.println(stringPrefix.solve(A, B));
        System.out.println(stringPrefix.solve(C, D));
        System.out.println(stringPrefix.solve(P, Q));
        System.out.println(solve1("abc","ac"));*/

       /* int[] re = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(twoSum(re,target));
*/
        System.out.println(solve1("scaler"));

        //System.out.println(solve10(new int[]{1,2,2,1}, new int[]{2,3,1,2}));
    }

    public static String solve1(String A) {
        String str = "";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (A.charAt(i) == letters.charAt(j)) {
                    int index = j + 1;
                    str = str + A.charAt(i) + index;
                }
            }
        }
        return str;
    }

   /* public static int[] solve10(int[] A, int[] B) {
       Set<Integer> set = new HashSet<>();
       int[] arr = new int[A.length];

       for(int i = 0; i < A.length; i++){
           int count = 0;
           for(int j = 0; j < B.length; j++){
               if(A[i] == B[j]){
                  hashMap.put(count+1, A[i]);
               }
           }
       }
       return arr;
    }*/

    public static int solve5(String A, String B) {
        int index = -1;
        if(A.contains(B)){
            index = A.indexOf(B);
            index = index+1;
        }
        return index;
    }

    public static int[] twoSum(final int[] A, int B) {
        int[] arr = new int[2];
        for(int i = 0; i<A.length-1; i++){
            for(int j= i+1 ; j < A.length; j++){
                int sum = A[i] + A[j];
                if(sum == B){
                    arr[0] = i+1;
                    arr[1] = j+1;
                }
            }
        }
        for(int x : arr){
            System.out.println(x);
        }
        return arr;

    }
}
