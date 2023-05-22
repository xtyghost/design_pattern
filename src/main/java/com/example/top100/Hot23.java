package com.example.top100;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 合并k哥升序链表
 */
public class Hot23 {
    ListNode head;
    ListNode current;
    {
        ListNode node = new ListNode();
        head = node;
        current = node;
    }

    /**
     * 最小堆
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        TreeMap<ListNode,Integer> listNodes = new TreeMap<>(Comparator.comparingInt(a -> a.val));
        for (ListNode node : lists) {
            while (node!=null){
                listNodes.put(node,listNodes.getOrDefault(node,0)+1);
                node=node.next;
            }
        }
        listNodes.forEach((k,v)->{
            for (Integer i = 0; i < v; i++) {
                current.next = new ListNode(k.val);
                current = current.next;
            }
        });
        return  head.next;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
       return  mergeKLists(Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList()));
    }
    public ListNode mergeKLists(List<ListNode> nodes) {
        if (nodes.isEmpty()){
            return head.next;
        }
        ListNode remove = nodes.stream().reduce((a, b) -> a.val <= b.val ? a : b).get();
        if (nodes.size()==1){
            current.next = nodes.get(0);
            return head.next;
        }else {
            nodes.remove(remove);
            current.next = remove;
            current= current.next;
            if (remove.next !=null){
                nodes.add(0,remove.next);
            }
        }
       return  mergeKLists(nodes);
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
