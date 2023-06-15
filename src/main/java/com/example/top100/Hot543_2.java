package com.example.top100;

public class Hot543_2 {
    public int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        doDiameterOfBinaryTree(root);
        return ans;
    }

    public int doDiameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = doDiameterOfBinaryTree(root.left);
        int r = doDiameterOfBinaryTree(root.right);
        ans = Math.max(ans, l + r);
        return Math.max(l, r) + 1;
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

