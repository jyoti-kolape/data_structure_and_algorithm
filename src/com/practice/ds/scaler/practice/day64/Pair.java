package com.practice.ds.scaler.practice.day64;

public class Pair<TreeNode, Integer> {
    TreeNode key;
    int value;

    public Pair(TreeNode key, int value) {
        this.key = key;
        this.value = value;
    }

    public TreeNode getKey() {
        return key;
    }

    public void setKey(TreeNode key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
