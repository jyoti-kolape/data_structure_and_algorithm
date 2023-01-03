package com.practice.ds.success;

public class AddBinary {

    public static void main(String args[]) {
        //String a = "1101", b = "100";

        String A = "100"; String B ="11";

        System.out.print(addBinary(A, B));
    }

    static String addBinary(String A, String B) {

        String result = "";
        int s = 0;
        int i = A.length() - 1, j = B.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0) ? A.charAt(i) - '0' : 0);
            s += ((j >= 0) ? B.charAt(j) - '0' : 0);

            result = (char) (s % 2 + '0') + result;
            s /= 2;
            i--;
            j--;
        }

        return result;
    }
}
