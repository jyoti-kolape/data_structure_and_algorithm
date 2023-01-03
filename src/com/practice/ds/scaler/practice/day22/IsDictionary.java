package com.practice.ds.scaler.practice.day22;

import java.util.ArrayList;
import java.util.Arrays;

public class IsDictionary {
    public static void main(String[] args) {
        String[] arr1 = {"hello", "scaler", "interviewbit"};
        ArrayList<String> A = new ArrayList<>(Arrays.asList(arr1));
        String B = "adhbcfegskjlponmirqtxwuvzy";
        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<String> A, String B) {
        int[] orderMap = new int[26];
        for (int i = 0; i < B.length(); i++) {
            orderMap[B.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.get(i).length(); j++) {
                if (j >= A.get(i + 1).length()) {
                    return 0;
                }
                if (A.get(i).charAt(j) != A.get(i + 1).charAt(j)) {
                    int currentWordChar = A.get(i).charAt(j) - 'a';
                    int nextWordChar = A.get(i + 1).charAt(j) - 'a';
                    if (orderMap[currentWordChar] > orderMap[nextWordChar])
                        return 0;
                    else break;
                }
            }
        }
        return 1;
    }
}
