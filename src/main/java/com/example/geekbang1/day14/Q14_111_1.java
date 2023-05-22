package com.example.geekbang1.day14;

/**
 * 二叉树的最小深度
 * @author xutong
 */
public class Q14_111_1 {
    public static void main(String[] args) {

    }
    public int minDepth(TreeNode root) {
        return minDepth(root,0);
    }
    public int minDepth(TreeNode root, int current) {
        if (root==null){
            return current;
        }
        current++;
        if (root.left==null){
            return minDepth(root.right,current);
        }
        if (root.right==null){
            return minDepth(root.left,current);
        }
        return Math.min(minDepth(root.left,current),minDepth(root.right,current));
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
