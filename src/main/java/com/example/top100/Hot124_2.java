
package com.example.top100;

public class Hot124_2 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.left.left = new TreeNode(4);
        node.left.left.left.left = new TreeNode(5);
        System.out.println(new Hot124_2().maxPathSum(node));

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
        int l = subTreeSum(root.left);
        int r = subTreeSum(root.right);
        int max = Math.max(l, r);
        int sum = getMaxSum(l, r, root.val);
        if (sum > maxSum) {
            maxSum = sum;
        }
        return root.val + Math.max(max, 0);
    }

    private int getMaxSum(int l, int r, int val) {
        if (l >= 0 && r >= 0) {
            return l + r + val;
        } else if (l < 0 && r < 0) {
            return val;
        } else if (l < 0 && r >= 0) {
            return r + val;
        } else {
            return l + val;
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
