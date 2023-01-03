package com.practice.ds.success;

import java.util.ArrayList;

public class ProductArrayPuzzle {
    public static void main(String s[]){
        ArrayList<Integer> A = new ArrayList<>();
        //1, 2, 3, 4, 5
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        ArrayList<Integer> res = solve(A);
        for(int x : res){
            System.out.print(x+" ");
        }

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < A.size(); i++){
            int product = 1;
            for(int j = i+1; j < A.size(); j++){
                product = product * A.get(j);
            }
            if(i != 0){
                for(int k = i-1; k >=0; k--){
                    product =product * A.get(k);
                }
            }
            resultList.add(product);
        }
        return resultList;
    }
}
