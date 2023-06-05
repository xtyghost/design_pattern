package com.example.top100;

public class Hot234_1 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        listNode.next= new ListNode(2);
//        listNode.next.next= new ListNode(2);
//        listNode.next.next.next= new ListNode(1);
        System.out.println(new Hot234_1().isPalindrome(listNode));
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next==null){
            return true;
        }
        ListNode oneStep = head;
        ListNode twoStep = head;
        ListNode mid = new ListNode(1);
        while (oneStep != null && twoStep != null) {
            if (twoStep.next == null) {
                mid = oneStep.next;
                oneStep = head;
                break;
            }
            twoStep = twoStep.next.next;
            if (twoStep == null) {
                mid = oneStep.next;
                oneStep = head;
                break;
            }
            oneStep = oneStep.next;

        }
        ListNode p = null;
        while (true) {
            ListNode next = mid.next;
            mid.next = p;
            p = mid;
            if (next==null){
                break;
            }
            mid = next;
        }
        while (mid != null) {
            if (mid.val != oneStep.val) {
                return false;
            }
            oneStep = oneStep.next;
            mid = mid.next;
        }
        return true;
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
