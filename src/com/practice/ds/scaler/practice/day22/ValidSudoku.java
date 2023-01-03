package com.practice.ds.scaler.practice.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ValidSudoku {
    public static void main(String[] args) {
        String[] arr1 = {"53..7....", "6..195...", ".98....6.","8...6...3",
                "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
        List<String> A = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(isValid(Arrays.asList(arr1)));
    }

    public static int isValid(final List<String> A) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Character number = A.get(i).charAt(j);
                if (number != '.') {
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in box " + i / 3 + "-" + j / 3)) {
                        return 0;
                    }

                }

            }
        }
        return 1;
    }
}
