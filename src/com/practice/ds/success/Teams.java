package com.practice.ds.success;

public class Teams {
    public static void main(String agrs[]) {
        System.out.println(Teams.solve("00011011"));
    }

    public static int solve(String A) {
        int count0 = 0, count1 = 0;
        int cnt = 0;
        for (int i = 0; i < A.length(); i++)
        {
            if (A.charAt(i) == '0')
            {
                count0++;
            }
            else
            {
                count1++;
            }
            if (count0 == count1)
            {
                cnt++;
            }
        }

        if (cnt == 0)
        {
            return -1;
        }
        return cnt;
    }
}
