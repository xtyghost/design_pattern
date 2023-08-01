
package com.example.top100;

import java.util.ArrayList;
import java.util.List;

public class Hot114 {
    TreeNode leftNode;

    public void flatten(TreeNode root) {
        TreeNode rootCopy = root;
        while (rootCopy != null) {
            leftNode = rootCopy;
            rootCopy = rootCopy.left;
        }
        doFlatten(root);
        rootCopy = root;
        while (rootCopy != null) {
            rootCopy.right= rootCopy.left;
            rootCopy.left = null;
            rootCopy= rootCopy.right;
        }
    }

    public void doFlatten(TreeNode root) {
        if (root == null) {
            return;
        }
        doFlatten(root.left);
        if (root.right != null) {
            leftNode.left = root.right;
            while (leftNode.left != null) {
                leftNode=leftNode.left;
            }
        }
        doFlatten(root.right);
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
