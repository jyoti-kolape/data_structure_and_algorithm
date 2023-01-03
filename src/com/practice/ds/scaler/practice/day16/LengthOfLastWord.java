package com.practice.ds.scaler.practice.day16;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(final String A) {
        int len = 0;
        if (!A.isEmpty()) {
            for (int i = A.length() - 1; i >= 0; i--) {
                if (A.charAt(i) != ' ') {
                    String str = "";
                    while (i >= 0 && A.charAt(i) != ' ') {
                        str = str + A.charAt(i);
                        i--;
                    }
                    len = str.length();
                }
            }
        }
        return len;
    }
}
