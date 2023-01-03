package com.practice.ds.scaler.practice.day28;




public class BSTNodesInARange {

    private static TreeNode treeNode;

    public int solve(TreeNode A, int B, int C) {
        if(A == null) {
            return 0;
        }
        if(A.val >= B && A.val <= C){
            return 1 + this.solve(A.left, B, C)+ this.solve(A.right, B, C);
        }else if(A.val < B){
            return this.solve(A.right, B, C);
        }else {
            return this.solve(A.left, B, C);
        }

    }

   /* int getCount(TreeNode node, int low, int high)
    {
        // Base Case
        if(node == null)
            return 0;

        // If current node is in range, then
        // include it in count and recur for
        // left and right children of it
        if(node.va >= low && node.data <= high)
            return 1 + this.getCount(node.left, low, high)+
                    this.getCount(node.right, low, high);

            // If current node is smaller than low,
            // then recur for right child
        else if(node.data < low)
            return this.getCount(node.right, low, high);

            // Else recur for left child
        else
            return this.getCount(node.left, low, high);
    }*/
}
