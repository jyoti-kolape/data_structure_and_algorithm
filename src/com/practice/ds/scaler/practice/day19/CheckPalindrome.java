package com.practice.ds.scaler.practice.day19;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {
    public static void main(String[] args) {

        System.out.println(solve("yzfbzbyyrurquqf"));

    }

    public static int solve(String A) {
            int ans = 0;
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < A.length(); i++) {
                String s = String.valueOf((char) A.charAt(i));
                if (!(map.containsKey(A.charAt(i)))) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s) + 1);
                }
            }
            int evenCcount = 0;
            int oddCcount = 0;
            for (int i = 0; i < A.length(); i++) {
                String s = String.valueOf((char) A.charAt(i));
                int freq = map.get(s);

                if (freq % 2 == 0) {
                    evenCcount++;
                }else {
                    oddCcount++;
                }
            }
            if(A.length() % 2 == 0 && evenCcount == A.length()){
                ans = 1;
            }
            if (oddCcount == 1) {
                ans = 1;
            }
            return ans;
    }
    public int solve1(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (map.containsKey(A.charAt(i))) {
                map.put(A.charAt(i), map.get(A.charAt(i)) + 1);
            } else {
                map.put(A.charAt(i), 1);
            }
        }
        int evenCount = 0, oddCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            return 0;
        }
        return 1;
    }
}
