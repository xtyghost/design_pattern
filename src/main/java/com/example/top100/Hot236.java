
package com.example.top100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hot236 {

    public static void main(String[] args) {


    }

    TreeNode commonParent;
    TreeNode p;
    TreeNode q;
    Set<TreeNode> emptSet = new HashSet<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p = p;
        this.q = q;
        allNodeOfTree(root);
        return commonParent;
    }


    public Set<TreeNode> allNodeOfTree(TreeNode root) {
        HashSet<TreeNode> nodes = new HashSet<>();
        if (commonParent != null) {
            return nodes;
        }
        if (root == null) {
            return nodes;
        }
        if (root.equals(p)||root.equals(q)){
            nodes.add(root);
        }
        nodes.addAll(allNodeOfTree(root.left));
        nodes.addAll(allNodeOfTree(root.right));
        if (nodes.contains(p) && nodes.contains(q)) {
            commonParent = root;
        }
        if (commonParent != null) {
            return emptSet;
        }
        return nodes;
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
