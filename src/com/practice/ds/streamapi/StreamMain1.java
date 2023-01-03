package com.practice.ds.streamapi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        //Create list and filter all even number from list.
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(50);
        list1.add(21);
        list1.add(22);
        list1.add(67);
        System.out.println(list1);

        /*List<Integer> list2 = Arrays.asList(23, 567, 12, 677, 24);
        System.out.println(list1);*/

        //Without Stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //Using Stream
        List<Integer> integerList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(integerList);

        Integer integer = list1.stream().findAny().get();
        System.out.println(integer);
    }

}
