package com.practice.ds.success1.day28;

import javax.swing.tree.TreeNode;

public class SymmetricBinaryTree {
    private static TreeNode root;

    public int isSymmetric(TreeNode A) {
        return 1;
    }

   /* public int solve(TreeNode r1, TreeNode r2) {

        if(r1 == null && r2 == null)
            return 1;
        if(r1 == null || r2 == null)
            return 0;

        if(r1.val != r2.val)
            return 0;

        int left = solve(r1.left, r2.right);
        if(left == 0)
            return 0;

        int right = solve(r1.right, r2.left);
        if(right == 0)
            return 0;

        return 1;
    }*/
}
