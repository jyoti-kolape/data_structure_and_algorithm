package com.practice.ds.scaler.practice.day64;

import java.util.*;

public class TopViewOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        System.out.println(solve(root));
    }

    public static ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        Pair<TreeNode, Integer> pair = new Pair<>(A, 0);
        queue.add(pair);
        int left = -1;
        int right = 1;
        int min = 0;
        int max = 0;
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> poll = queue.poll();
            TreeNode key = poll.getKey();
            Integer value = poll.getValue();
            List<Integer> list = null;
            if (map.containsKey(value)) {
                list = map.get(value);
            } else {
                list = new ArrayList<>();
            }
            list.add(key.val);
            map.put(value, list);
            if (key.left != null) {
                Pair<TreeNode, Integer> leftPair = new Pair<>(key.left, value + left);
                queue.add(leftPair);
                min = Math.min(min, value + left);
            }
            if (key.right != null) {
                Pair<TreeNode, Integer> leftPair = new Pair<>(key.right, value + right);
                queue.add(leftPair);
                max = Math.max(max, value + right);
            }
        }
        for (int i = min; i <= max; i++) {
            List<Integer> list = map.get(i);
            ans.add(list.get(0));
        }
        return ans;
    }
}
