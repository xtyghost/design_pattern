package com.example.geekbang1.day7;

import com.example.design_pattern.design_pattern.mediator.Stock;

/**
 * @author xutong
 */
public class Q7_84_1 {
    public static void main(String[] args) {
        System.out.println(new Q7_84_1().largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public int largestRectangleArea(int[] heights) {
        Node head = new Node(0);
        Node tail = new Node(0);
        head.next= tail;
        tail.pre= head;
        for (int i = 0; i < heights.length; i++) {
            add(head,new Node(heights[heights.length-1-i]));
        }
        Node next = head.next;
        int max = 0;
        while (next !=tail){
            int val1 = next.val;
            if (max<val1*heights.length){
                max = getMax(next, max);
            }
            next = next.next;
        }
        return max;
    }

    private int getMax(Node next, int max) {
        int val =getMax(next);
        if (val> max){
            max = val;
        }
        return max;
    }

    private int getMax(Node node) {
        Node pre = node;
        int val = node.val;
        int sum = val;
        while (true){
            node=node.next;
            if (node!=null&&node.val>=val){
                sum+=val;
            }else {
                break;
            }
        }
        while (true){
            pre=pre.pre;
            if (pre!=null&&pre.val>=val){
                sum+=val;
            }else {
                break;
            }
        }
        return sum;
    }

    public void  add(Node node,Node insert){
        Node next = node.next;
        node.next= insert;
        insert.pre = node;
        next.pre= insert;
        insert.next= next;
    }

    public static class Node{
        Node next;
        Node pre;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
