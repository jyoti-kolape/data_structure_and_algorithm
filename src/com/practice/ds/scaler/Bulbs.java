package com.practice.ds.scaler;

import java.util.ArrayList;

public class Bulbs {

    public static void main(String agrs[]){

    }
    public int bulbs(ArrayList<Integer> A) {
        int count = 0;
        for(int i=0; i < A.size(); i++){
            if(A.get(i) == 0){
                A.set(i, 1);
            }
        }
        return 0;
    }
}
