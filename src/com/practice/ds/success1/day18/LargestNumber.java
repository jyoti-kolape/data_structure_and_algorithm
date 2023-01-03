package com.practice.ds.success1.day18;

import java.util.*;

public class LargestNumber {
    public static void main(String args[]) {
        List<Integer> A = new ArrayList<>();
        //[3, 30, 34, 5, 9]
        A.add(3);
        A.add(30);
        A.add(34);
        A.add(5);
        A.add(9);
        //2, 3, 9, 0
       /* A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);*/
        System.out.println(largestNumber1(A));

    }

    public static String largestNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : A) {
            result.add(num);
        }
        String s = "";
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                String firstNumber = result.get(i).toString();
                String secondNumber = result.get(j).toString();
                if (!(firstNumber.equals(secondNumber))) {
                    if (!(Long.parseLong(firstNumber + secondNumber) > Long.parseLong(secondNumber + firstNumber))) {
                        int temp = result.get(j);
                        result.set(j, result.get(i));
                        result.set(i, temp);
                    }
                }
            }
        }
        for (int x : result) {
            s += String.valueOf(x);
        }
        if (s.charAt(0) == '0') {
            return "0";
        }
        return s;
    }

    public static String largestNumber1(final List < Integer > A) {
        StringBuffer strBuf = new StringBuffer();
        int i = 0;
        Node num[] = new Node[A.size()];
        for (int n: A) {
            num[i] = new Node(n);
            i++;
        }
        Arrays.sort(num);
        for (Node n: num) {
            if (n.number == 0 && strBuf.length() != 0)
                continue;
            strBuf.append(n.number);
        }
        return strBuf.toString();
    }
    static class Node implements Comparable < Node > {
        int number;
        public Node(int number) {
            this.number = number;
        }
        @Override
        public int compareTo(Node o) {
            String first = String.valueOf(this.number) + String.valueOf(o.number);
            String second = String.valueOf(o.number) + String.valueOf(this.number);
            return second.compareTo(first);
        }
    }
}
