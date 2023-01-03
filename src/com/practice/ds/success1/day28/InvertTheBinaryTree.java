package com.practice.ds.success1.day28;

public class InvertTheBinaryTree {
    private static TreeNode root;

    public static void main(String[] args) {
        InvertTheBinaryTree invertTheBinaryTree = new InvertTheBinaryTree();
        invertTheBinaryTree.root = new TreeNode(1);
        invertTheBinaryTree.root.left = new TreeNode(2);
        invertTheBinaryTree.root.right = new TreeNode(3);

        System.out.println(invertTheBinaryTree.invertTree(root));

    }
    public TreeNode invertTree(TreeNode A) {
        if(A==null)
            return null;
        invertTree(A.left);
        invertTree(A.right);
        TreeNode temp = A.right;
        A.right = A.left;
        A.left = temp;
        return A;
    }
 }


