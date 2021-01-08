/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CommonAncestor Author: xutong Date: 2020/5/15 4:20 下午
 * Description: Leetcode : 235. Lowest Common Ancestor of a Binary Search Tree History: <author>
 * <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.leetcode.commonancestor;

/**
 * 〈一句话功能简述〉<br>
 * 〈Leetcode : 235. Lowest Common Ancestor of a Binary Search Tree〉
 *
 * @author xutong
 * @create 2020/5/15
 * @since 1.0.0
 */
public class CommonAncestor {
  public static void main(String[] args) {
    //
  }

  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root ==null){
          return root;
      }
      if (root.val>p.val&&root.val>q.val){
          lowestCommonAncestor(root.left,p,q);
      }
      if (root.val<p.val&&root.val<q.val){
          lowestCommonAncestor(root.right,p,q);
      }
      return root;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode(int val) {
    this.val = val;
  }
}
