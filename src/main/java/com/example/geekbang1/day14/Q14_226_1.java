package com.example.geekbang1.day14;

/**
 * 翻转二叉树
 * @author xutong
 */
public class Q14_226_1 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        doInvertTree(root);
        return root;
    }
    public void doInvertTree(TreeNode root) {
        if (root==null){
            return;
        }
        TreeNode tmp = root.right;
        root.right= root.left;
        root.left= tmp;
        doInvertTree(root.right);
        doInvertTree(root.left);
    }

     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
}
