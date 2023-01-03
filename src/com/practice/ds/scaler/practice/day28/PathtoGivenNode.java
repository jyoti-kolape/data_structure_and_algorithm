package com.practice.ds.scaler.practice.day28;

import java.util.ArrayList;
import java.util.List;

public class PathtoGivenNode {
    public static void main(String[] args) {

    }
    private List<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ans.clear();
        fillPath(A, B);

        int n = ans.size();
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i = n - 1; i >= 0; i--) {
            ret.add(n - i - 1, ans.get(i));
        }
        return ret;
    }

    boolean fillPath(TreeNode root, int B) {
        if(root == null) {
            return false;
        }
        if(root.val == B) {
            ans.add(B);
            return true;
        }
        boolean left = fillPath(root.left, B);
        boolean right = fillPath(root.right, B);
        if(left | right) {
            ans.add(root.val);
        }
        return left | right;

    }
}
