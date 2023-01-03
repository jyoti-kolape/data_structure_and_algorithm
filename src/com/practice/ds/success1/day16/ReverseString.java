package com.practice.ds.success1.day16;

public class ReverseString {
    public static void main(String[] args) {
        String str = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(solve(str));
    }

    public static String solve(String A) {
        String ans = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) != ' ') {
                String str = "";
                while (i >= 0 && A.charAt(i) != ' ') {
                    str = str + A.charAt(i);
                    i--;
                }
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                if (!ans.isEmpty()) {
                    ans += ' ';
                }
                ans += sb.toString();
            }
        }
        return ans;
    }
}
