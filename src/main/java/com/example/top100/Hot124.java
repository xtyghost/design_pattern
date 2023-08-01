
package com.example.top100;

import java.util.HashSet;
import java.util.Set;

public class Hot124 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.left.left = new TreeNode(4);
        node.left.left.left.left = new TreeNode(5);
        System.out.println(new Hot124().maxPathSum(node));

    }

    int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = root.val;
        subTreeSum(root);
        return maxSum;
    }

    public int subTreeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = Math.max(subTreeSum(root.left), 0);
        int r = Math.max(subTreeSum(root.right), 0);
        int max = Math.max(l, r);
        int sum = l + r + root.val;
        maxSum = Math.max(maxSum, sum);
        return root.val + max;
    }


    public static class TreeNode {
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
