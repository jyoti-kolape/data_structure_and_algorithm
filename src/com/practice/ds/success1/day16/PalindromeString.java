package com.practice.ds.success1.day16;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("1a2"));
    }

    public static int isPalindrome(String A) {
        int ans = 0;
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if ((A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') || (A.charAt(i) >= 'a' && A.charAt(i) <= 'z')
                    || (A.charAt(i) >= '0' && A.charAt(i) <= '9')) {
                st.append(A.charAt(i));
            }
        }
        String str = st.toString();
        if(str.length() == 0){
            return 1;
        }
        int start = 0, end = str.length() - 1;
        while (start < str.length() && end >= 0) {
            char c1 = str.charAt(start);
            if (str.charAt(start) >= 'A' && str.charAt(start) <= 'Z') {
                c1 += Math.abs('a' - 'A');
            }
            char c2 = str.charAt(end);
            if (str.charAt(end) >= 'A' && str.charAt(end) <= 'Z') {
                c2 += Math.abs('a' - 'A');
            }
            if (c1 == c2) {
                ans = 1;
                start++;
                end--;
            } else {
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
