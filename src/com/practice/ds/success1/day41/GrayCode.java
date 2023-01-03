package com.practice.ds.success1.day41;

import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(grayCode(2));
    }

    public static ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        if (a == 1) {
            temp.add(0);
            temp.add(1);
            return temp;
        }
        ArrayList<Integer> tempResult = grayCode(a - 1);
        for (int i = 0; i < tempResult.size(); i++) {
            resultList.add(tempResult.get(i));
        }
        for (int i = tempResult.size() - 1; i >= 0; i--) {
            resultList.add(tempResult.get(i) + (1 << a - 1));
        }

        return resultList;
    }
}
