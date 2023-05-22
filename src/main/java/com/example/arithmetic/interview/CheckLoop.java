package com.example.arithmetic.interview;


/**
 * 链表中环的检测
 * @author xutong
 */
public class CheckLoop {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
       ListNode node = new ListNode();
       ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
        System.out.println(new CheckLoop().hasCycle(node.next));

    }

        public boolean hasCycle(ListNode head) {
            ListNode p1 = head;
            ListNode p2 = head;
            while (p2!=null&&p2.next!=null){
                p1= p1.next;
                p2= p2.next.next;
                if (p1==p2){
                    return true;
                }
            }
        return false;
        }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
