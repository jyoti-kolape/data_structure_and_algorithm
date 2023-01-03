package com.practice.ds.scaler;

import java.util.ArrayList;

public class InterestingArray {

    public String solve(ArrayList<Integer> A) {
        int counter = 0;
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) % 2 != 0){
                counter++;
            }
        }
        if(counter % 2 ==0){
            return "YES";
        }else{
            return "NO";
        }
    }


}
