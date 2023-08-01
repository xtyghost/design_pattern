
package com.example.top100;

import java.util.HashSet;
import java.util.Set;

public class Hot437 {

    public static void main(String[] args) {
        Integer[] arr = {1000000000, 1000000000, null, 294967296, null, 1000000000, null, 1000000000, null, 1000000000};

        TreeNode root = new TreeNode(1000000000);
        root.left = new TreeNode(1000000000);
        root.left.left = new TreeNode(294967296);
        root.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left.left = new TreeNode(1000000000);

        System.out.println(new Hot437().pathSum(root, 0));

    }

    int count = 0;
    double originValue;
    Set<TreeNode> set = new HashSet();

    public int pathSum(TreeNode root, int targetSum) {
        originValue = targetSum;
        doPathSum(root, targetSum);
        return count;
    }

    public void doPathSum(TreeNode root, double targetSum) {
        if (root == null) {
            return;
        }
        if (root.val == targetSum) {
            count++;
        }
        doPathSum(root.left, targetSum - root.val);
        doPathSum(root.right, targetSum - root.val);
        if (set.add(root.left)) {
            doPathSum(root.left, originValue);
        }
        if (set.add(root.right)) {
            doPathSum(root.right, originValue);

        }
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
