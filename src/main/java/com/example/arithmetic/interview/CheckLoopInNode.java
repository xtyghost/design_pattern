package com.example.arithmetic.interview;


import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import lombok.Data;

import static cn.hutool.http.ContentType.JSON;

/**
 * 链表中环的检测
 * @author xutong
 */
public class CheckLoopInNode {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
       ListNode node = new ListNode();
       ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
        listNode.next= node.next;
        System.out.println(new CheckLoopInNode().cycleLength(node.next).val);

    }

        public ListNode cycleLength(ListNode head) {
            ListNode p1 = head;
            ListNode p2 = head;
            ListNode p3 = head;

            while (p2!=null&&p2.next!=null){
                p1= p1.next;
                p2= p2.next.next;
                if (p1==p2){
                 while (p3!=p1){
                    p1=p1.next;
                    p3=p3.next;
                 }
                 return p3;
                }
            }
            return null;
        }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
