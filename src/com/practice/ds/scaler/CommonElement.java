package com.practice.ds.scaler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElement {
    public static void main(String args[]) {
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        arrayListA.add(1);
        arrayListA.add(2);
        arrayListA.add(2);
        arrayListA.add(1);

        arrayListB.add(2);
        arrayListB.add(3);
        arrayListB.add(1);
        arrayListB.add(2);

        System.out.println(CommonElement.solve(arrayListA,arrayListB));

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
       for(int i=0; i< A.size(); i++){
           for(int j=0; j<B.size(); j++){
               if(A.get(i) == B.get(j)){
                   set.add(A.get(i));
               }
           }
       }
        for (Integer t : set)
            arrayList.add(t);

       return arrayList;
    }
}
