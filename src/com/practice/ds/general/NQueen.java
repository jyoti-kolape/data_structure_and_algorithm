package com.practice.ds.general;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static String[][] solveNQueens(int n) {
        String[][] result = new String[n][n];
        int queen = 0;
        int col = 0;
        String board[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        return solveNQueens1(n, queen, col, board, result);
    }

    public static String[][] solveNQueens1(int n, int queen, int col, String board[][], String[][] result) {
        if (n == queen) {

            return result = board;
        }

        for (int i = 0; i < board.length; i++) {
            int column = col;
            int row = i;
            if (isSafe(row, column, board)) {
                board[row][column] = "Q";
                solveNQueens1(n, queen + 1, column + 1, board, result);
            } else {
                board[row][column] = ".";
            }
        }

        return result;
    }

    static boolean isSafe(int x, int y, String sol[][]) {
        if (x >= 0 && y >= 0 && x <= sol.length && y <= sol.length) {
            // Checking rows and col safety
            for (int i = x; i < sol.length; i++) {
                for (int j = y; j < sol.length; j++) {
                    if (sol[i][j] == "Q") {
                        return false;
                    }
                }
            }
            // Checking diagonal safety (right down diagonal)
            for (int i = x + 1; i < sol.length; i++) {
                if (sol[i][i] == "Q") {
                    return false;
                }
            }

            // Checking diagonal safety (upper right diagonal)
            for (int i = x - 1; i >= 0; i--) {
                if (sol[i][i] == "Q") {
                    return false;
                }
            }

        } else {
            return true;
        }
        return true;
    }
}
