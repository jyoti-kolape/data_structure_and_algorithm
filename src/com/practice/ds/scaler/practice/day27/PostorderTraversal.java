package com.practice.ds.scaler.practice.day27;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
    private static TreeNode root;
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

        PostorderTraversal postorderTraversal = new PostorderTraversal();
        postorderTraversal.root = new TreeNode(1);
        postorderTraversal.root.right = new TreeNode(2);
        postorderTraversal.root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
        // 1, 2, 3 ans - 3, 2, 1
    }

    public static ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack<TreeNode> S = new Stack<>();
        if (A == null)
            return list;
        S.push(A);
        TreeNode prev = null;
        while (!S.isEmpty()) {
            TreeNode current = S.peek();
            if (prev == null || prev.left == current ||
                    prev.right == current) {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.val);
                }
            } else if (current.left == prev) {
                if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.val);
                }
            } else if (current.right == prev) {
                S.pop();
                list.add(current.val);
            }

            prev = current;
        }

        return list;
    }
}
