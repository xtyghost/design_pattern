package com.example.studyplan_1;

/**
 * @author xutong
 */
public class Q8_617 {
    public static void main(String[] args) {
        Integer[]   arr1 = {1,3,2,5};    Integer[] arr2 ={2,1,3,null,4,null,7};
        TreeNode root1 = new TreeNode();
        formTreeNode(arr1, root1);


        TreeNode root2 = new TreeNode();
        formTreeNode(arr2,root2);
        TreeNode treeNode = new Q8_617().mergeTrees(root1, root2);
        System.out.println(treeNode);
    }

    private static void formTreeNode(Integer[] arr1, TreeNode root1) {
        TreeNode r1 = root1;
        r1.val=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            i = setChildValu(arr1, r1, i);
            if (++i< arr1.length){
                i--;
                r1=r1.left;
                i = setChildValu(arr1, r1, i);
            }
            if (++i< arr1.length){
                i--;
                r1=r1.right;
                i = setChildValu(arr1, r1, i);
            }
        }
    }

    private static int setChildValu(Integer[] arr1, TreeNode r1, int i) {
        if (++i < arr1.length&&arr1[i]!=null){

            r1.left= new TreeNode(arr1[i]);
        }
        if (++i < arr1.length&&arr1[i]!=null){
            r1.right= new TreeNode(arr1[i]);
        }
        return i;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null&&root2!=null){
            return root2;
        }
        if (root1!=null&&root2==null){
            return root1;
        }
        if (root1==null&&root2==null){
            return null;
        }
        TreeNode left = mergeTrees(root1.left, root2.left);
        TreeNode right = mergeTrees(root1.right, root2.right);
        return new TreeNode(root1.val+root2.val, left, right);
    }



    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
