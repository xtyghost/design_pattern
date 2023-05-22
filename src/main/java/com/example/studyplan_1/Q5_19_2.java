package com.example.studyplan_1;

/**
 * 慢指针方法解决问题,链表问题主要构建虚假的header解决空指针
 * @author xutong
 */
public class Q5_19_2 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2));
             ListNode next = listNode.next;
        for (int i =3; i < 6; i++) {
                   next.next =new ListNode(i);
                   next = next.next;
        }
        ListNode node = new Q5_19_2().removeNthFromEnd(listNode, 2);
        while (node != null){
            System.out.println(node.val);
            node =  node.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);//构造虚假的head防止start==null
        pre.next = head;
        ListNode start = pre,end =pre;
        //让start和end相差n
        while (n != 0){
            start = start.next;
            n--;
        }
        while (start.next != null){
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;//删除指定n
        return pre.next;
    }


     public static class ListNode {
         int val;
         ListNode next;
        public ListNode() {}
        public    ListNode(int val) { this.val = val; }
         public  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
