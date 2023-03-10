package com.practice.ds.scaler.practice.day63;

import com.practice.ds.scaler.practice.day64.Pair;

import java.util.*;

public class LevelOrder {
    public static void main(String[] args) {
        /*3
         / \
        9  20
          /  \
        15   7*/
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrder(root));
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
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
            if (key.left != null) {
                Pair<TreeNode, Integer> leftPair = new Pair<>(key.left, level);
                queue.add(leftPair);
            }
            if (key.right != null) {
                Pair<TreeNode, Integer> leftPair = new Pair<>(key.right, level);
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
