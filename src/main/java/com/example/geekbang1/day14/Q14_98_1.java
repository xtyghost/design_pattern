package com.example.geekbang1.day14;

/**
 * 验证二叉搜索树
 * @author xutong
 */
public class Q14_98_1 {
    public static void main(String[] args) {

    }
    Long MIN = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val<=MIN) {
            return false;
        }
        MIN= Long.valueOf(root.val);
        return isValidBST(root.right);
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
