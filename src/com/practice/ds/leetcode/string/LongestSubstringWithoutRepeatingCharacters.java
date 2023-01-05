package com.practice.ds.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}
