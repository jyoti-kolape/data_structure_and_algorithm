package com.practice.ds.scaler;

import java.util.ArrayList;

public class RangeSumQuery {

    public static void main(String s[]){
       /* A = [1, 2, 3, 4, 5]
        B = [[1, 4], [2, 3]]*/
        ArrayList<Integer> A = new ArrayList<>();
        /*A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);*/
        A.add(2);
        A.add(2);
        A.add(2);
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(1);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(2);
        innerList2.add(3);

        B.add(innerList1);
        B.add(innerList2);

        ArrayList<Long> result = rangeSum(A,B);
        for(long x : result){
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> result = new ArrayList<>();
        Long[] aPS = new Long[A.size()];
        Long sum = 0L;
        for(int i = 0; i < A.size(); i++){
            sum = sum +A.get(i);
            aPS[i] = sum;
        }

        for(int j = 0; j < B.size(); j++){
            ArrayList<Integer> innerList = B.get(j);
            Long elementSum = 0L;
            for(int k = 0; k < innerList.size(); k++){
                int s = innerList.get(k);
                int e = innerList.get(k+1);
                s = s-1;
                e = e-1;
                if(s == 0){
                    elementSum = aPS[e];
                }else{
                    elementSum = aPS[e] - aPS[s-1];
                }
                result.add(elementSum);
                break;
            }
        }
        return result;
    }
}
