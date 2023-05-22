package com.example.geekbang1.day14;

/**
 * 二叉树的最大深度
 * @author xutong
 */
public class Q14_104_1 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }
    public int maxDepth(TreeNode root,int current) {
        if (root==null){
            return current;
        }
        current++;
        return Math.max(maxDepth(root.left,current),maxDepth(root.right,current));
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
