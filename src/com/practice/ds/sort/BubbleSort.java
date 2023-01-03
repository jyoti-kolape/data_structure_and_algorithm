package com.practice.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {34, 7, 4, 10, 5,1,100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(bubbleSort(list));
    }

    public static List<Integer> bubbleSort(List<Integer> list) {
        for (int index = 0; index < list.size(); index++) {
            int i = 0; int flag = 0;
            while (i < list.size() - 1 - index) {
                if (list.get(i) > list.get(i + 1)) {
                    flag = 1;
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
                if(flag == 0){
                    return list;
                }
                i++;
            }
        }
        return list;
    }
}
