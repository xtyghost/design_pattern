package com.example.top100;

public class Hot543 {
    public int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int i = lengthSubTree(root.left, 1) + lengthSubTree(root.right, 1);
        if (i > max) {
            max = i;
        }
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return max;
    }

    public int lengthSubTree(TreeNode root, int length) {
        if (root == null) {
            return length - 1;
        }

        return Math.max(lengthSubTree(root.left, length + 1), lengthSubTree(root.right, length + 1));
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

