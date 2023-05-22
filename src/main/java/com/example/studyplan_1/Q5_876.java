package com.example.studyplan_1;

import java.util.HashMap;

/**
 * @author xutong
 */
public class Q5_876 {
    public static void main(String[] args) {
       ListNode listNode = new ListNode(1,new ListNode(2));
       ListNode next = listNode.next;
        for (int i =3; i < 7; i++) {
            next.next =new ListNode(i);
            next = next.next;
        }
        ListNode result = new Q5_876().middleNode(listNode);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode middleNode(ListNode head) {
        ListNode pre = new ListNode();
        pre.next = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int n = 1;
        while (pre != null){
            map.put(n,pre);
            pre= pre.next;
            n++;
        }
        return map.get((n)/2+1);
    }

  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
