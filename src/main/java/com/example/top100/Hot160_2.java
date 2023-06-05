package com.example.top100;

import com.alibaba.fastjson.JSONArray;

public class Hot160_2 {
    public static void main(String[] args) {
        int intersectVal = 0;
        int[] listA = {2, 6, 4}, listB = {1, 5};

        ListNode headA = new ListNode(2);
        headA.next =new ListNode(1);
        ListNode headB = new ListNode(1);
        ListNode intersectionNode2 = new Hot160_2().getIntersectionNode(headA, headB);
        System.out.println(JSONArray.toJSONString(intersectionNode2));

    }



    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
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
