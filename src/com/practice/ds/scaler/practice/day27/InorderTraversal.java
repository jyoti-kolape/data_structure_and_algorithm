package com.practice.ds.scaler.practice.day27;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
    private static TreeNode root;

    public static void main(String[] args) {
        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.root = new TreeNode(1);
        inorderTraversal.root.right = new TreeNode(2);
        inorderTraversal.root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }

    public static ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}
