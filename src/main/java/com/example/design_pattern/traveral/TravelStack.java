package com.example.design_pattern.traveral;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 遍历使用stack
 *
 * @author xutong
 */
public class TravelStack {

    public static class TreeNode {
        public Object data;
        public TreeNode leftChild;
        public TreeNode rightChild;
    }

    /**
     * 先序遍历
     */
    public static void preOrderTraveralWithStack(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.empty()) {
            System.out.println(treeNode.data);
            stack.push(treeNode);
            treeNode = treeNode.leftChild;
            while (treeNode == null && !stack.isEmpty()) {
                treeNode = stack.pop().rightChild;
            }
        }
    }

    /**
     * 中序遍历
     */
    public static void midOrderTraveralWithStack(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.empty()) {
            stack.push(treeNode);
            treeNode = treeNode.leftChild;
            while (treeNode == null && !stack.isEmpty()) {
                TreeNode pop = stack.pop();
                System.out.println(pop.data);
                treeNode = pop.rightChild;
            }
        }
    }

    /**
     * 后序遍历
     */
    public static void afterOrderTraveralWithStack(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        int index = 1;
        while (treeNode != null) {
            //consume
            if (treeNode.leftChild == null && treeNode.rightChild == null) {
                System.out.println(treeNode.data);
                if (stack.isEmpty()) {
                    treeNode = null;
                } else {
                    TreeNode pop = stack.pop();
                    if (pop.leftChild == treeNode) {
                        pop.leftChild = null;
                    }
                    if (pop.rightChild == treeNode) {
                        pop.rightChild = null;
                    }
                    treeNode = pop;
                }
                continue;
            }
            stack.push(treeNode);
            //produce
            if (treeNode.leftChild != null) {
                treeNode = treeNode.leftChild;
                continue;
            }
            if (treeNode.rightChild != null) {
                treeNode = treeNode.rightChild;
                continue;
            }
        }
    }

    /**
     * 层序列遍历
     */
    public static void levelOrderTraveralWithQueue(TreeNode treeNode) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.push(treeNode);
        while (!treeNodes.isEmpty()) {
            TreeNode first = treeNodes.poll();
            System.out.println(first.data);
            if (first.leftChild != null){
                treeNodes.offer(first.leftChild);
            }
            if (first.rightChild != null){
                treeNodes.offer(first.rightChild);
            }
        }


    }

    public static void buildTree(TreeNode treeNode) {
        TreeNode leftChild = new TreeNode();
        TreeNode rightChild = new TreeNode();
        leftChild.data = 2;
        rightChild.data = 3;
        treeNode.leftChild = leftChild;
        treeNode.rightChild = rightChild;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.data = 0;
        buildTree(treeNode);
        buildTree(treeNode.leftChild);
        buildTree(treeNode.rightChild);
        System.out.println("====levelOrderTraveralWithQueue");
        levelOrderTraveralWithQueue(treeNode);
        System.out.println("====preOrderTraveralWithStack");
        preOrderTraveralWithStack(treeNode);
        System.out.println("====midOrderTraveralWithStack");
        midOrderTraveralWithStack(treeNode);
        System.out.println("====afterOrderTraveralWithStack");
        afterOrderTraveralWithStack(treeNode);

    }
}
