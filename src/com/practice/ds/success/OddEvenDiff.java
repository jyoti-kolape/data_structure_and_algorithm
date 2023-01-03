package com.practice.ds.success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OddEvenDiff {
    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(9);

      /*  arrayList.add(5);
        arrayList.add(17);
        arrayList.add(100);
        arrayList.add(1);*/

        System.out.println(OddEvenDiff.solve(arrayList));
    }

    public static int solve(ArrayList<Integer> A) {
        int maxEvenNum = 0;
        int minOddNum = 0;
        ArrayList<Integer> arrayListEvenNum = new ArrayList<>();
        ArrayList<Integer> arrayListOddNum = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                arrayListEvenNum.add(A.get(i));
            }
            if (A.get(i) % 2 != 0) {
                arrayListOddNum.add(A.get(i));
            }
        }
        if(!arrayListEvenNum.isEmpty()){
            Collections.sort(arrayListEvenNum);
            maxEvenNum = arrayListEvenNum.get(arrayListEvenNum.size()-1);
        }else{
            maxEvenNum = 0;
        }
        if(!arrayListOddNum.isEmpty()){
            Collections.sort(arrayListOddNum);
            minOddNum = arrayListOddNum.get(0);
        }else{
            minOddNum = 0;
        }

        System.out.println(maxEvenNum);
        System.out.println(minOddNum);
        return maxEvenNum - minOddNum;
    }
}
