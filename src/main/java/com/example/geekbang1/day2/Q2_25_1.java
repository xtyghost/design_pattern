package com.example.geekbang1.day2;

/**
 * @author xutong
 */
public class Q2_25_1 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        ListNode node = new ListNode();
        ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
        ListNode node1 = new Q2_25_1().reverseKGroup(node.next,2);
        System.out.println(node1.val);
        while (node1.next !=null){
            System.out.println(node1.next.val);
            node1 = node1.next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int startIndex =0;

        ListNode last = null;
        ListNode startNode = new ListNode();
        ListNode cStart = startNode;
        ListNode lastStart = startNode;
        ListNode remainder = new ListNode();
        ListNode remainder2 = remainder;
        while (head != null){
            if (startIndex == 0){
                cStart =head;
            }
            remainder2 = deepCloneList(head, remainder2);
            ListNode next = head.next;
            head.next = last;
            last = head;
            head = next;
            startIndex++;
            if (startIndex%k==0){
                if (k == startIndex){
                    startNode.next=  last;
                }else {
                    cStart.next = last;
                    cStart = lastStart;
                }
                lastStart=head;
                 remainder = new ListNode();
                 remainder2 = remainder;
                last = null;
            }
        }
        cStart.next = remainder.next;
        if (startNode.next == null){
            startNode.next = remainder.next;
        }
    return startNode.next;
    }

    private ListNode deepCloneList(ListNode head, ListNode remainder2) {
        remainder2.next= new ListNode(head.val);
        remainder2 = remainder2.next;
        return remainder2;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
