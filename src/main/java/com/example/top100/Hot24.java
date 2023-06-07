package com.example.top100;

import com.alibaba.fastjson.JSONArray;

public class Hot24 {
    public static void main(String[] args) {
        Hot24 hot142 = new Hot24();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
//        listNode.next.next.next = new ListNode(4);
        ListNode node = hot142.swapPairs(listNode);
        System.out.println(JSONArray.toJSONString(node));

    }

    public ListNode swapPairs(ListNode head) {
        ListNode result = head;
        if (result != null && result.next != null) {
            result = head.next;
        }
        ListNode dummyHead = null;
        ListNode tempLast = null;
        int index = 0;
        while (head != null) {
            if (index % 2 == 0) {
                if (tempLast != null) {
                    tempLast.next = head.next;
                    if (tempLast.next == null) {
                        tempLast.next = head;
                        break;
                    }
                }
                tempLast = head;
                dummyHead = null;
            }
            ListNode next = head.next;
            head.next = dummyHead;
            dummyHead = head;
            head = next;
            index++;
        }
        return result;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
