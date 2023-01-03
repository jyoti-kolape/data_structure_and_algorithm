package com.practice.ds.success1.day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class NumberChecker {
    public static void main(String[] args) {
        int[] numberArray = {1456, 345671, 43218, 123};
        System.out.println(findQualifiedNumbers(numberArray));
    }

    static String findQualifiedNumbers(int[] numberArray) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int number : numberArray) {
            if (findContainsOneTwoThree(number)){
                array.add(number);
            }
        }
        Collections.sort(array);
        StringBuffer strbuf = new StringBuffer();
        Iterator it = array.iterator();
        while (it.hasNext()) {

            int value = (int)it.next();
            if (strbuf.length() > 0)
                strbuf.append(",");

            strbuf.append(Integer.toString(value));
        }

        return (strbuf.length() > 0) ?
                strbuf.toString() : "-1";

    }
    private static boolean findContainsOneTwoThree(int number){
        String str = Integer.toString(number);
        return (str.contains("1") && str.contains("2") &&
                str.contains("3"));
    }
}
