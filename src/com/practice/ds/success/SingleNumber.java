package com.practice.ds.success;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {

    public static void main(String args[]) {
        List<Integer> A = new ArrayList<>(); //1, 2, 2, 3, 1
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(1);
        System.out.println(singleNumber(A));

    }

    public static int singleNumber(final List<Integer> A) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < A.size(); i++) {
            int count = 1;
            if (hashMap.get(A.get(i)) == null) {
                hashMap.put(A.get(i), count);
            } else {
                int value = hashMap.get(A.get(i));
                hashMap.put(A.get(i), count + value);
            }
        }
        int ans = 0;
        for(int i = 0; i < A.size(); i++){
            int currAns = hashMap.get(A.get(i));
            if(currAns == 1){
                ans = A.get(i);
           }
        }
        return ans;
    }
}
