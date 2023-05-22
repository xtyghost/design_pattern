package com.example.geekbang1.day2;

/**
 * @author xutong
 */
public class Q2_25_2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        ListNode node = new ListNode();
        ListNode listNode = node;
        for (int anInt : ints) {
            listNode.next= new ListNode(anInt);
            listNode=listNode.next;
        }
        ListNode node1 = new Q2_25_2().reverseKGroup(node.next,2);
        System.out.println(node1.val);
        while (node1.next !=null){
            System.out.println(node1.next.val);
            node1 = node1.next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode last = null;
        ListNode lastGroupEnd = null;
        boolean flag = true;
        ListNode result = head;
        while (head != null){
            ListNode currentGroupStart = getEnd(head,k);
            if (currentGroupStart ==null){
                lastGroupEnd.next= head;
             return result;
            }
            if (flag){
                flag =false;
                result= currentGroupStart;
            }
            if (lastGroupEnd != null){
                lastGroupEnd.next= currentGroupStart;
            }
             lastGroupEnd = head;
            while (currentGroupStart !=last){
                ListNode next = head.next;
                head.next= last;
                last = head;
                head= next;
            }
            last=null;
        }
        return result;
    }

    private ListNode getEnd(ListNode head, int k) {
        for (int i = 0; i < k-1; i++) {
            head=head.next;
            if (head==null){
                return null;
            }
        }
        return head;
    }




    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
