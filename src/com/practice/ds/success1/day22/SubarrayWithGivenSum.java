package com.practice.ds.success1.day22;

import java.util.*;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 10, 20, 100, 105};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        int B = 110;
        System.out.println(subArraySum(A, B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0, end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            map.put(i, A.get(i));
        }
        for (int i = 0; i < A.size(); i++) {
            int diff = B - A.get(i);
            if (map.containsValue(diff)) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (diff == entry.getValue()) {
                        if (entry.getKey() == i + 1) {
                            start = i;
                            end = entry.getKey();
                        }
                    }
                }
            }
        }
        if (start == 0 && end == 0) {
            ans.add(-1);
        } else {
            for (int i = start; i <= end; i++) {
                ans.add(A.get(i));
            }
        }
        return ans;
    }


    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static ArrayList<Integer> subArraySum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int curr_sum = A.get(0), start = 0, i = 0, p = 0;

        for (i = 1; i <= A.size(); i++) {
            while (curr_sum > B && start < i - 1) {
                curr_sum = curr_sum - A.get(start);
                start++;
            }
            if (curr_sum == B) {
                p = i - 1;
                break;
            }

            if (i < A.size()){
                curr_sum = curr_sum + A.get(i);
            }
        }
        if (p == 0) {
            ans.add(-1);
        } else {
            for (int j = start; j <= p; j++) {
                ans.add(A.get(j));
            }
        }
        return ans;
    }


}
