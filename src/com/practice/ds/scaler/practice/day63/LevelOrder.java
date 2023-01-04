package com.practice.ds.scaler.practice.day63;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        q.add(null);
        while (q.size() > 1) {
            ArrayList<Integer> subAns = null;
            TreeNode node = q.poll();
            if (node == null) {
                subAns = new ArrayList<>();
                q.add(null);
                continue;
            }
            subAns.add(node.val);
            //System.out.print(node.val + " ");
            if (node.left != null) {
                q.add(node.left);
            }

            if (node.right != null) {
                q.add(node.right);
            }
            ans.add(subAns);
        }
        return ans;
    }
}
