package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;
import java.util.Map;

/**
 * 复制带随机指针的链表
 */
public class Hot138 {
    private Map<Node, Node> nodeMap;

    public Node copyRandomList(Node head) {
        nodeMap = new HashMap<>();
        Node node = head;
        Node dummyHead = new Node(-1);
        Node copy = dummyHead;
        while (node != null) {
            Node value = new Node(node.val);
            value.random = node.random;
            dummyHead.next = value;
            nodeMap.put(node, value);
            dummyHead = dummyHead.next;
            node = node.next;
        }
        Node result = copy.next;
        copy = result;
        while (copy != null) {
            copy.random = nodeMap.get(copy.random);
            copy = copy.next;
        }
        return result;
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
