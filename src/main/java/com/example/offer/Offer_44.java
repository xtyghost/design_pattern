package com.example.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer_44 {


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

    ArrayList<Integer> list = new ArrayList<>();
    int currentLevel = -1;

    public List<Integer> largestValues(TreeNode root) {
        largestValues(root, 0);
        return list;
    }

    public void largestValues(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (currentLevel < level) {
            currentLevel = level;
            list.add(level, root.val);
        }
        Integer levelMax = list.get(level);
        if (levelMax < root.val) {
            list.set(level, root.val);
        }
        largestValues(root.left, level + 1);
        largestValues(root.right, level + 1);
    }
}
