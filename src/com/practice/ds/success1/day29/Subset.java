package com.practice.ds.success1.day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        Integer[] A = {1,2,3};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(A));
        System.out.println(subsets1(arrayList));
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = A.size();

        for (int i = 0; i < (1 << n); i++) {
            ArrayList<Integer> subSet = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0){
                    subSet.add(A.get(j));
                }
            }
            res.add(subSet);
        }
        return res;
    }

    public static List<List<Integer>> subsets1(ArrayList<Integer> A) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : A) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }

}
