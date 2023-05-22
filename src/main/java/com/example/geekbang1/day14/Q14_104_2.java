package com.example.geekbang1.day14;

/**
 * 二叉树的最大深度
 * @author xutong
 */
public class Q14_104_2 {
    public static void main(String[] args) {

    }
    public int depth;
    public int ans;
    public int maxDepth(TreeNode root) {
        calc(root);
        return ans;
    }
    public void calc(TreeNode root) {
        if (root==null){
            ans = Math.max(ans,depth);
            return ;
        }
        depth++;
        calc(root.left);
        calc(root.right);
        depth--;
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
