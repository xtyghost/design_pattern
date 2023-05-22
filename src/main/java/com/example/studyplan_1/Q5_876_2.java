package com.example.studyplan_1;

/**
 * 采用慢指针解决问题
 * @author xutong
 */
public class Q5_876_2 {
    public static void main(String[] args) {
       ListNode listNode = new ListNode(1,new ListNode(2));
       ListNode next = listNode.next;
        for (int i =3; i < 6; i++) {
            next.next =new ListNode(i);
            next = next.next;
        }
        ListNode result = new Q5_876_2().middleNode(listNode);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode middleNode(ListNode head) {

        ListNode left = head,right= head;
        while (right != null&&right.next != null){
            right=right.next.next;
            left = left.next;
        }
        return left ;
    }

  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
