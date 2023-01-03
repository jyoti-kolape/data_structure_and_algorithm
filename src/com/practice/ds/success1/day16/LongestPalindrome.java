package com.practice.ds.success1.day16;

public class LongestPalindrome {
    public static void main(String[] args) {
        //System.out.println(solve("abcaa"));

        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalSubstr(str));
    }

    public static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }
    public static int longestPalSubstr(String A) {
        int maxLength = 1;
        int start = 0;
        int len = A.length();
        int low, high;

        for (int i = 1; i < len; ++i) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && A.charAt(low) == A.charAt(high)) {
                --low;
                ++high;
            }
            ++low;
            --high;
            if (A.charAt(low) == A.charAt(high) && high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && A.charAt(low) == A.charAt(high)) {
                --low;
                ++high;
            }
            ++low;
            --high;
            if (A.charAt(low) == A.charAt(high) && high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
        }
        return maxLength;
    }

    public static int solve(String A) {
        int maxLength = 0;
        int noOfOperation = 1;
        int noOflen = 1;
        int sLength = A.length();
        for (int i = 1; i < sLength; i++) {
            StringBuilder str1 = new StringBuilder();
            while (noOfOperation <= noOflen) {
                for (int j = i - 1; j >= 0; j--) {
                    str1.append(A.charAt(j));
                }
                noOflen++;
            }


            StringBuilder str2 = new StringBuilder();
            noOfOperation = 0;
            for (int k = i + 1; k < A.length() && noOfOperation < noOflen; k++) {
                str2.append(A.charAt(k));
                noOfOperation++;
            }
            if (str1.toString().equals(str2.toString())) {
                maxLength = str1.toString().length();
            }
        }
        return maxLength;

    }
}
