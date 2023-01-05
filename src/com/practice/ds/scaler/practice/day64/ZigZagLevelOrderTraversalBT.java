package com.practice.ds.scaler.practice.day64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagLevelOrderTraversalBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        System.out.println(zigzagLevelOrder(root));
    }

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();

        Pair<TreeNode, Integer> pair = new Pair<>(A, 0);
        queue.add(pair);
        int level = 0;
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> poll = queue.poll();
            TreeNode key = poll.getKey();
            Integer value = poll.getValue();
            ArrayList<Integer> list = null;
            if (map.containsKey(value)) {
                list = map.get(value);
            } else {
                list = new ArrayList<>();
            }
            list.add(key.val);
            map.put(value, list);
            level = value + 1;
            if (key.right != null) {
                Pair<TreeNode, Integer> leftPair = new Pair<>(key.right, level);
                queue.add(leftPair);
            }

            if (key.left != null) {
                Pair<TreeNode, Integer> leftPair = new Pair<>(key.left, level);
                queue.add(leftPair);
            }
        }
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Integer> list = map.get(i);
            ans.add(list);
        }
        return ans;
    }
}
