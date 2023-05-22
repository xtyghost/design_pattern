package com.example.design_pattern.algorithm.iscycle;

/**
 * @author xutong
 */
public class IsCycle {
    /**
     * 链表节点
     */
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    /**
     * 判断是否有环
     * @param head
     * @return
     */
    public static boolean isCycle(Node head){
        Node p1 = head;
        Node p2 = head;
        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2 ){
                return true;
            }
        }
        return false;
    }


}
