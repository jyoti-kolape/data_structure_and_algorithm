package com.practice.ds.success1.day45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        //164, 182, 187, 202,
        Integer[] arr1 = {1};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(search(A, 1));
    }

    public static int search(final List<Integer> A, int B) {
        int i = 0;
        int j = A.size() - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (A.get(mid) == B)
                return mid;
            if (A.get(mid) >= A.get(i)) {
                if (B >= A.get(i) && B < A.get(mid))
                    j = mid - 1;
                else
                    i = mid + 1;
            } else {
                if (B > A.get(mid) && B <= A.get(j))
                    i = mid + 1;
                else
                    j = mid - 1;
            }
        }
        return -1;
        /*int start = 0;
        int end = A.size() - 1;
        final int pivot = searchPivot(A, start, end, B);
        return pivot;*/
    }

    public static int searchPivot(final List<Integer> A, int start, int end, int B) {
        int res = -1;
        if (end >= start) {
            int mid = start + (end - start) / 2;
            //int mid = start + end / 2;
            if (A.get(mid) == B) {
                return mid;
            } else if (A.get(mid - 1) >= B) {
                res = searchPivot(A, start, mid - 1, B);
            } else {
                res = searchPivot(A, mid + 1, end, B);
            }
        }
        return res;
    }
}
