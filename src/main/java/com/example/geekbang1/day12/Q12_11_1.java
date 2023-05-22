package com.example.geekbang1.day12;

import cn.hutool.json.JSONArray;
import lombok.Data;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * 盛最多水的容器
 * @author xutong
 */
public class Q12_11_1 {
    public static void main(String[] args) {
        System.out.println(new Q12_11_1().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    /**
     * 单调栈
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int highest= 0;
        int max= 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i]>highest){
                highest = height[i];
            }
        }
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(0,0));
        for (int i = 0; i < height.length; i++) {
                if (height[i]<=highest&&height[i]>nodes.get(nodes.size()-1).val){
                    nodes.add(new Node(height[i],i));
                }
        }
        Stack<Node> rightStack = new Stack<>();
        rightStack.push(new Node(0,0));
        for (int i = 0; i < height.length; i++) {
            if (height[height.length-1-i]>rightStack.peek().val){
                rightStack.push(new Node(height[height.length-1-i],height.length-1-i));
            }
        }
        while (!rightStack.isEmpty()) {
            nodes.add(rightStack.pop());
        }
        int right = nodes.size()-1;
        for (int i = 1; i < nodes.size(); i++) {
            for (int j = right; j>i; j--) {
                Node leftNode = nodes.get(i);
                Node rightNode = nodes.get(right);
                int current = findSquare(leftNode, rightNode);
                if (current>max){
                    max = current;
                }
                if (leftNode.val<rightNode.val){
                    break;
                }
                    right--;
            }
        }
        return max;
    }

    public int findSquare(Node leftNode, Node rightNode){
        return (rightNode.index-leftNode.index)*Math.min(leftNode.val,rightNode.val);
    }
    public static class Node{
        public Node(int val, int index) {
            this.val = val;
            this.index = index;
        }

        int val;
        int index;
    }

}
