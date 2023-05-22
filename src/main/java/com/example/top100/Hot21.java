package com.example.top100;

import java.util.List;

/**
 * 合并两个有序的链表
 */
public class Hot21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 !=null&&list2 != null){
            if (list1.val<list2.val){
               current.next= list1;
               list1= list1.next;
            }else {
                current.next= list2;
                list2= list2.next;
            }
            current = current.next;
        }
        if (list1==null){
            current.next=list2;
        }
        if (list2==null){
            current.next=list1;
        }
        return head.next;
    }

    /**
     * 递归的方式处理
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }


   public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
