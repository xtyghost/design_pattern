package com.example.geekbang1.day12;

import java.util.Stack;

/**
 *
 * 盛最多水的容器
 * @author xutong
 */
public class Q12_11_2 {
    /**
     * 单调栈
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        Stack<Node> nodes = new Stack<>();
        int max =0;
        nodes.push(new Node(height[0],0));
        for (int i = 1; i < height.length; i++) {
            if (nodes.peek().val<height[i]){
                nodes.push(new Node(height[i],i));
            }
            int currentMax = findMax(nodes, max,new Node(height[i],i));
            if (currentMax >max) {
                max = currentMax;
            }
        }
        return max;
    }

    public int findMax(Stack<Node> nodes , int max, Node nd){
        for (Node node : nodes) {
            int current = (nd.index - node.index) * Math.min(nd.val, node.val);
            if (current>max){
                max = current;
            }
        }
        return max;
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
