
package com.example.top100;

import java.util.ArrayList;
import java.util.List;

public class Hot199 {

    int currentLevel = -1;
    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        rightSideView(root, 0);
        return list;
    }

    public void rightSideView(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (currentLevel < level) {
            currentLevel = level;
            list.add(0);
        }
        list.set(level, root.val);
        rightSideView(root.left, level + 1);
        rightSideView(root.right, level + 1);
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
