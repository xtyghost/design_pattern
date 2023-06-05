package com.example.top100;

import com.alibaba.fastjson.JSONArray;

public class Hot160_1 {
    public static void main(String[] args) {
        int intersectVal = 0;
        int[] listA = {2, 6, 4}, listB = {1, 5};

        ListNode headA = new ListNode(2);
        headA.next =new ListNode(1);
        ListNode headB = new ListNode(1);
        ListNode intersectionNode2 = new Hot160_1().getIntersectionNode(headA, headB);
        System.out.println(JSONArray.toJSONString(intersectionNode2));

    }




    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode tmp = headA;
        while (tmp.next != null) {
            tmp = tmp.next;
            lenA++;
        }
        tmp = headB;
        while (tmp.next != null) {
            tmp = tmp.next;
            lenB++;
        }
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                headB = headB.next;
            }
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
