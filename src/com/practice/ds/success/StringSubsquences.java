package com.practice.ds.success;

public class StringSubsquences {
    public static void main(String args[]) {
        String A = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        String subs = "AG";
        int count = 0;
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                count++;
            }
            if (A.charAt(i) == 'G') {
                ans = count + ans;
            }
        }
        System.out.println(ans);
    }
}
