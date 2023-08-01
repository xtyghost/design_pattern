package com.example.top100;

public class Hot230 {
    int ans ;
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k =k;
        kthSmallest(root);
        return ans;
    }
    public void kthSmallest(TreeNode root) {
        if (root==null){
            return;
        }
        kthSmallest(root.left);
        k--;
        if (k==0){
            ans= root.val;
        }
        kthSmallest(root.right);
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
