package com.practice.ds.success;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenSum {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(EvenSum.solve(arrayList));

    }

    public static int solve(ArrayList<Integer> A) {
        int sum = 0;
        Set<Integer> hSet = new HashSet<Integer>();
        for (Integer x : A) {
            if (x % 2 == 0) {
                hSet.add(x);
            }
        }
        Iterator<Integer> setIterator = hSet.iterator();
        while(setIterator.hasNext()){
            sum = sum + setIterator.next();
        }
        return sum;
    }

}

