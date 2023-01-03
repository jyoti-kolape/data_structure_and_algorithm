package com.practice.ds.general;

public class TypeCounter {

    public static void typeCounter(String sentence) {
        String strArray[] = sentence.split(" ");

        for(int i = 0; i <= sentence.length(); i++){

            String name = strArray[i].getClass().getName();
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        typeCounter("can you give me 10 bucks puff in 7.5 or 7");
    }
}
