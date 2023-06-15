package com.example.top100;

import java.util.ArrayList;
import java.util.List;

public class Hot94 {
    public List<Integer> nodes;

    public List<Integer> inorderTraversal(TreeNode root) {
        nodes= new ArrayList<>();

        doInorderTraversal(root);
        return nodes;
    }
    public void doInorderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        doInorderTraversal(root.left);
        nodes.add(root.val);
        doInorderTraversal(root.right);
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
