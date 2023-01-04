package com.practice.ds.scaler.practice.day63;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


// Recursive Java program for level
// order traversal of Binary Tree

/* Class containing left and right child of current
node and key value*/
class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
