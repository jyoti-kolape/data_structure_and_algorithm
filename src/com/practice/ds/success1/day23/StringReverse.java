package com.practice.ds.success1.day23;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        reverse(input);
    }

    public static void reverse(String input) {
        if (input == null || input.length() <= 1)
            System.out.println(input);
        else {
            System.out.print(input.charAt(input.length() - 1));
            reverse(input.substring(0, input.length() - 1));
        }
    }
}
