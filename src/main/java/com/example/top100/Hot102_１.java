package com.example.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树层序便利
 */
public class Hot102_１ {

    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder(root, 0);
        return lists;
    }

    public void levelOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == lists.size()) {
            lists.add(level, new ArrayList<>());
        }
        List<Integer> arr = lists.get(level);

        arr.add(root.val);
        levelOrder(root.left, level + 1);
        levelOrder(root.right, level + 1);
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

