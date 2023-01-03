package com.practice.ds.scaler.practice.day27;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {
    private static TreeNode root;

    public static void main(String[] args) {
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        preorderTraversal.root = new TreeNode(1);
        preorderTraversal.root.right = new TreeNode(2);
        preorderTraversal.root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));
    }

    public static ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode root = A;
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            res.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return res;
    }
}
