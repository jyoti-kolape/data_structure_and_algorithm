package com.practice.ds.leetcode;

public class MedianOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0, counter = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr[counter] = nums1[i];
                i++;
                counter++;
            } else if (nums1[i] > nums2[j]) {
                arr[counter] = nums2[j];
                j++;
                counter++;
            } else {
                arr[counter] = nums1[i];
                counter++;
                arr[counter] = nums2[j];
                i++;
                j++;
                counter++;
            }
        }

        for (int k = i; k < nums1.length; k++) {
            arr[counter] = nums1[k];
            counter++;
        }
        for (int k = j; k < nums2.length; k++) {
            arr[counter] = nums2[k];
            counter++;
        }
        double ans;
        int midIndex = arr.length/2;
        if (arr.length % 2 == 0) {
            ans = arr[midIndex] + arr[midIndex-1];
            return ans/2;
        }
        ans = arr[midIndex];
        return ans;
    }
}
