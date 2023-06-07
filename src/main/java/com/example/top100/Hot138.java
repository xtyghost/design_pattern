package com.example.top100;

import com.alibaba.fastjson.JSONArray;

/**
 * 复制带随机指针的链表
 */
public class Hot138 {
    private static Node Node;

    public static void main(String[] args) {
        Hot138 hot138 = new Hot138();
        Node Node = new Node(1);
        Node.next = new Node(2);
        Node.next.next = new Node(3);
//        Node.next.next.next = new Node(4);
        Node node = hot138.copyRandomList(Node);
        System.out.println(JSONArray.toJSONString(node));

    }

    public Node copyRandomList(Node head) {

        return head;
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
