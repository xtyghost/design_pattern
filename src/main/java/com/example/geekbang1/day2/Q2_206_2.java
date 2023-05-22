package com.example.geekbang1.day2;

/**
 * @author xutong
 */
public class Q2_206_2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        ListNode node = new ListNode();
        ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
        ListNode node1 = new Q2_206_2().reverseList(node.next);
        System.out.println(node1.val);
        while (node1.next !=null){
            System.out.println(node1.next.val);
            node1 = node1.next;
        }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
