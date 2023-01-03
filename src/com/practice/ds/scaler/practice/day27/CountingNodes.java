package com.practice.ds.scaler.practice.day27;

public class CountingNodes {
    private static TreeNode root;

    static int count;


    public static void main(String[] args) {
        CountingNodes countingNodes = new CountingNodes();
        countingNodes.root = new TreeNode(4);
        countingNodes.root.left = new TreeNode(5);

        countingNodes.root.right = new TreeNode(2);
        countingNodes.root.right.left = new TreeNode(3);
        countingNodes.root.right.right = new TreeNode(6);

        System.out.println(solve(root));
    }

    public static int solve(TreeNode A) {
        count = 1;
        traverse(A, A.val);
        return count;
    }

    public static void traverse(TreeNode root, int max) {
        if (root == null) {
            return;
        } else {
            if (root.val > max)
                count++;
            traverse(root.left, Math.max(max, root.val));
            traverse(root.right, Math.max(max, root.val));
        }
    }

}
