package com.practice.ds.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        //Set<Character> set = new HashSet<>();
        int maxLength = 0;
        char visited ;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);


        }
        return maxLength;
        /*HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            if (seen.containsKey(s.charAt(end))) {
                start = Math.max(start, seen.get(s.charAt(end)) + 1);
            }
            seen.put(s.charAt(end), end);
            maximum_length = Math.max(maximum_length, end - start + 1);
        }
        return maximum_length;*/
    }
}
