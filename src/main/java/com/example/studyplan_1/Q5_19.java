package com.example.studyplan_1;

import java.util.HashMap;

/**
 * @author xutong
 */
public class Q5_19 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2));
             ListNode next = listNode.next;
        for (int i =3; i < 6; i++) {
                   next.next =new ListNode(i);
                   next = next.next;
        }
        ListNode node = new Q5_19().removeNthFromEnd(listNode, 2);
        while (node != null){
            System.out.println(node.val);
            node =  node.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode nullHeader = new ListNode();
        nullHeader.next= head;
        ListNode node = nullHeader;
        int index = 0;
        while (node != null){
            map.put(index++,node);
            node = node.next;
        }
        if (map.get( map.keySet().size() - n-1 ).next.next == null){
            map.get( map.keySet().size() - n-1 ).next = null;
        }else {
            map.get( map.keySet().size() - n-1 ).next= map.get( map.keySet().size() - n-1 ).next.next;
        }
        return nullHeader.next;
    }


     public static class ListNode {
         int val;
         ListNode next;
        public ListNode() {}
        public    ListNode(int val) { this.val = val; }
         public  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
