package com.example.arithmetic.interview;


/**
 * 链表中环的检测
 * @author xutong
 */
public class CheckLoopLength {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
       ListNode node = new ListNode();
       ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
//        listNode.next= node.next.next;
        System.out.println(new CheckLoopLength().cycleLength(node.next));

    }

        public int cycleLength(ListNode head) {
            ListNode p1 = head;
            ListNode p2 = head;
            int len =0;
            while (p2!=null&&p2.next!=null){
                p1= p1.next;
                p2= p2.next.next;
                if (p1==p2){
                    len=len+1;
                 while (p2.next!=p1){
                     len++;
                     p2=p2.next;
                 }
                 return len;
                }
            }
            return len;
        }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
