package com.practice.ds.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] h = {1, 1};
        System.out.println(maxArea(h));

    }

    public static int maxArea(int[] height) {
        int area = 0;
        int i = 0, j = height.length - 1;
        while (i <= j) {
            int tempArea = Math.min(height[i], height[j]) * (j - i);
            if (area < tempArea) {
                area = tempArea;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return area;

    }
}
