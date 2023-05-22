package com.example.geekbang1.day2;

import java.util.List;

/**
 * @author xutong
 */
public class Q2_206_1 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        ListNode node = new ListNode();
        ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
        ListNode node1 = new Q2_206_1().reverseList(node.next);
        System.out.println(node1.val);
        while (node1.next !=null){
            System.out.println(node1.next.val);
            node1 = node1.next;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head!=null){
            ListNode next = head.next;
            head.next= last;
            last= head;
            head= next;
        }
        return last;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
