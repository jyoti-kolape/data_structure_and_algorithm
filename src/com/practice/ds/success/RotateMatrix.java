package com.practice.ds.success;

import java.util.ArrayList;

public class RotateMatrix {
    public static void main(String s[]) {
     /*   [
    [1, 2],
    [3, 4]
 ]*/
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(4);
        /*arrayList2.add(5);
        arrayList2.add(6);*/

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(7);
        arrayList3.add(8);
        arrayList3.add(9);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(11);
        arrayList4.add(12);
        arrayList4.add(13);

        A.add(arrayList1);
        A.add(arrayList2);
        /*A.add(arrayList3);
        A.add(arrayList4);*/

        solve(A);

    }

    public static void solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> rotationMatrix = new ArrayList<>();
        ArrayList<ArrayList<Integer>> transposeMatrix = getTransposeMatrix(A);
        for(int row = 0; row < transposeMatrix.get(0).size(); row++){
            ArrayList<Integer> subList = new ArrayList<>();
            for(int col = transposeMatrix.size()-1; col >= 0; col--){
                subList.add(transposeMatrix.get(row).get(col));
            }
            rotationMatrix.add(subList);
        }

        for(int row = 0; row < rotationMatrix.get(0).size();row++){
            ArrayList<Integer> aList = A.get(row);
            for(int col = 0; col < rotationMatrix.size(); col++){
                aList.set(col, rotationMatrix.get(row).get(col));
            }
            A.set(row,aList);
        }
    }

    private static ArrayList<ArrayList<Integer>> getTransposeMatrix(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> transposeMatrix = new ArrayList<>();
        for (int col = 0; col < A.get(0).size(); col++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int row = 0; row < A.size(); row++) {
                subList.add(A.get(row).get(col));
            }
            transposeMatrix.add(subList);
        }
        return transposeMatrix;
    }
}

