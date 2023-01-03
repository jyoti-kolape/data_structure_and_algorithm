package com.practice.ds.success1.day18;

import java.util.ArrayList;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = generateMatrix(20);
        for (ArrayList<Integer> list : ans) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j <= A; j++) {
                list.add(0);
            }
            ans.add(list);
        }
        int value = 1, row = 0, col = 0, i = 0, j = 0;
        int dir = 1;
        while (value <= A * A) {
            if (dir == 1) {
                ArrayList<Integer> list = ans.get(row);
                while (row < A && col < A) {
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        value++;
                        col++;
                    } else {
                        break;
                    }
                }
                ans.set(row, list);
                row++;
                col--;
                i++;
                dir = 2;
            }
            if (dir == 2) {
                while (row < A && col < A) {
                    ArrayList<Integer> list = ans.get(row);
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        ans.set(row, list);
                        value++;
                        row++;
                    } else {
                        break;
                    }
                }
                col--;
                row--;
                dir = 3;
            }
            if (dir == 3) {
                ArrayList<Integer> list = ans.get(row);
                while (row < A && col < A && col >= 0) {
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        value++;
                        col--;
                    } else {
                        break;
                    }

                }
                ans.set(row, list);
                row--;
                col++;
                i++;
                dir = 4;
            }
            if (dir == 4) {
                while (row < A && row > 0) {
                    ArrayList<Integer> list = ans.get(row);
                    if (list.get(col) == 0) {
                        list.set(col, value);
                        ans.set(row, list);
                        value++;
                        row--;
                    } else {
                        break;
                    }
                }
                row++;
                col++;
                dir = 1;
            }
        }
        return ans;
    }

    public int[][] generateMatrix1(int A) {
        int[][] ans = new int[A][A];
        int count=1;
        int k=A;
        int gridNum=0;
        for(int gridSize=k;gridSize>=2;gridSize=gridSize-2) {
            int numOfSteps = gridSize - 1;
            for (int col = gridNum; col < gridNum+numOfSteps; col++) {
                ans[gridNum][col] = count;
                count++;
            }
            for (int row = gridNum; row < gridNum+numOfSteps; row++) {
                ans[row][A - gridNum-1] = count;
                count++;
            }
            for (int col = gridNum+numOfSteps ; col > gridNum; col--) {
                ans[gridNum+numOfSteps][col] = count;
                count++;
            }
            for (int row =gridNum+numOfSteps; row > gridNum; row--) {
                ans[row][gridNum] = count;
                count++;
            }
            gridNum++;
        }
        if(A%2!=0){
            ans[A/2][A/2]=A*A;
        }

        return ans;
    }
}
