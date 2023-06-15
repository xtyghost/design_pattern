package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;
import java.util.Map;

/**
 * 复制带随机指针的链表
 */
public class Hot148 {

    public static void main(String[] args) {
        Hot148 hot148 = new Hot148();
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(1);
        ListNode object = hot148.sortList(listNode);
        System.out.println(JSONArray.toJSONString(object));

    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyL = new ListNode(Integer.MIN_VALUE);
        ListNode dummyR = new ListNode(Integer.MAX_VALUE);

        int val = head.val;
        extracted(dummyL, dummyR, val, head);
        ListNode listNodeL = sortList(dummyL.next);
        ListNode listNodeR = sortList(dummyR.next);
        head.next = listNodeR;
        return listNodeL;
    }

    private static void extracted(ListNode dummyL, ListNode dummyR, int val, ListNode node) {
        ListNode mid = node;
        node = node.next;
        while (node != null) {
            if (node.val < val) {
                dummyL.next = node;
                dummyL = dummyL.next;
            } else {
                dummyR.next = node;
                dummyR = dummyR.next;
            }
            node = node.next;
            dummyL.next = null;
            dummyR.next = null;
        }
        dummyL.next = mid;
        mid.next = null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
