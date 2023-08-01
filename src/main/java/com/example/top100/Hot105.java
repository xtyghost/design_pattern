
package com.example.top100;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hot105 {

    public static void main(String[] args) {
        int[] preorder = {-77, 24, -74, 84, 93, 28, 83, 6, 95, 58, 59, 66, 22, -3, -66, -68, -22, 3, -80, -79, -85, 17, 32, 9, -88, -99, 14, -60, 13, -93, -63, 91, 82, 21, 26, -11, -32, -16, -100, -94, -31, -62, -89, 49, -9, -8, 87, -33, -81, 80, 0, 69, -7, 52, 67, -5, -65, 31, -30, 37, -57, 27, 23, 38, -28, 7, -82, -42, 11, -55, -36, -58, -24, 89, 56, 73, 41, 18, -87, -70, 4, -64, 20, -52, -39, 79, 19, 30, 65, 25, -71, -76, -1, 62, -69, 98, 39, -25, -73, 70, 88, -17, -20, -75, 55, 34, 57, 81, -10, 94, 48, -35, 5, -23, -44, 40, -51, -61, -13, -86, 63, 71, -97, 45, 43, 51, 75, 33, -34, 92, 47, -78, 85, -26, 97, -29, -92, -83, -59, 74, 96, 68, 77, 16, -4, 10, 60, 64, -21, -2, 1, -91, 86, 46, 76, -37, -19, -96, 36, -98, 29, -72, 61, 50, 15, -95, -40, -43, -53, 90, -15, -48, -27, -90, -54, 72, -50, -49, -18, 78, 54, 35, -38, 99, 44, -67, 53, -12, -41, 2, 8, -14, -84, -56, -6, 12, -45, 42, -47, -46};
        int[] inorder = {93, 28, 84, 83, -74, 59, 58, 66, -66, -3, -79, -80, 3, -22, -68, 22, -85, -99, 14, -88, 9, 32, 17, -60, 95, -93, 82, 21, 91, -63, 26, 13, -16, -32, -11, -100, 6, -62, 49, -89, -31, 87, -8, 69, 0, 80, -7, -81, -65, -5, 67, -30, 31, 52, -33, 37, -57, -9, 7, -28, -42, -82, 38, -55, 11, 23, -36, 27, 56, 89, 73, -24, 41, -58, -70, -87, 20, -64, -52, 4, 18, -94, 19, 30, -76, -1, -71, 62, -69, 25, -73, -25, 70, 39, 88, 98, -20, -17, 65, 55, -75, 79, 34, -39, 48, 94, -23, 5, -44, -35, 40, -10, -61, -51, -13, 81, 63, -97, 71, -86, 57, 45, 24, -34, 85, 97, -26, -78, -83, -92, 74, -59, 96, -29, 68, 47, 77, 92, 10, -4, 16, 60, 33, -21, 1, 86, 76, 46, -37, -91, -2, 64, 75, 51, -19, -96, 43, -98, 29, 61, -72, 50, 36, -95, -40, -43, 15, 90, -15, -53, -77, -54, -90, -49, -50, 72, -27, 35, 54, -38, 78, -67, 44, 53, 99, -41, -12, -18, 8, 2, -48, -56, -84, -14, -45, 12, 42, -6, -46, -47};


        TreeNode treeNode = new Hot105().buildTree(preorder, inorder);
        System.out.println(treeNode);
    }

    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;
        // 在中序遍历中定位根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 得到左子树中的节点数目
        int size_left_subtree = inorder_root - inorder_left;
        // 递归地构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
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
