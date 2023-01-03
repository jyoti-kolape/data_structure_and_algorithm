package com.practice.ds.success1.day27;

public class IdenticalBinaryTrees {
    public static void main(String[] args) {
        //System.out.println(isSameTree(new));
    }

    public int isSameTree(TreeNode A, TreeNode B) {
       if(identicalTrees(A, B)){
           return 1;
       }else{
           return 0;
       }
    }

    public  static boolean identicalTrees(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }

        if (A != null && B != null) {
            return (A.val == B.val && identicalTrees(A.left, B.left) && identicalTrees(A.right, B.right));
        }

        return false;
    }
}
