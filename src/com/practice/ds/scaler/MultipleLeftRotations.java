package com.practice.ds.scaler;

import java.util.ArrayList;

public class MultipleLeftRotations {
    public static void main(String s[]) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        /*A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);*/
        //5, 17, 100, 11
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(11);

        B.add(1);
       // B.add(3);
        ArrayList<ArrayList<Integer>> arr = solve(A,B);
        for(ArrayList<Integer> e : arr){
            for(int x : e){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int x : B) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < A.size(); i++)
                temp.add(A.get((i + x) % A.size()));
            ans.add(temp);
        }
        return ans;

    }

    public ArrayList<ArrayList<Integer>> solve1(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = a.size();
        for (int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++)
                temp.add(a.get((i + x) % n));
            ans.add(temp);
        }
        return ans;
    }
}
