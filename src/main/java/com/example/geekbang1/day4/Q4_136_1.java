package com.example.geekbang1.day4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * www.acwing.com
 * 136. 邻值查找
 * @author xutong
 */
public class Q4_136_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<=1)return;
        Node[] arr = new Node[n];
        Node[] an = new Node[n];
        for (int i = 0; i < n; i++) {
            Node node = new Node();
            node.val =scanner.nextLong();
            node.idx =i;
            arr[i]= node;
        }
        List<Node> list = Arrays.stream(arr).sorted((a,b)-> (int) (a.val - b.val)).collect(Collectors.toList());
        Node head = new Node();
        head.idx=-1;
        head.val= Long.MIN_VALUE+Integer.MAX_VALUE;
        Node tail = new Node();
        tail.idx=-1;
        tail.val=Long.MAX_VALUE-Integer.MAX_VALUE;
        head.next= tail;
        tail.pre= head;
        for (int i = 0; i < list.size(); i++) {
            addNode(head,list.get(i));
            head= list.get(i);
        }

        for (int i = n-1; i > 0; i--) {
            Node node = arr[i];
            Node pre = node.pre;
            Node next = node.next;
            Node nod;
            nod= Math.abs(node.val-pre.val) <=Math.abs(next.val-node.val)?pre:next;
            an[i]= nod;
            deleteNode(node);
        }
        for (int i =1; i < n; i++) {
            System.out.printf("%s %s",Math.abs(arr[i].val-an[i].val),an[i].idx+1);
            System.out.println();
        }
    }

    public static void deleteNode(Node current){
        Node next = current.next;
        Node pre = current.pre;
        next.pre = pre;
        pre.next = next;
    }

    public static void addNode(Node current,Node node){
        Node next = current.next;
        current.next=node;
        node.next= next;
        next.pre= node;
        node.pre = current;
    }
    public static class Node {
        Long val;
        int idx;
        Node next;
        Node pre;

        public Long getVal() {
            return val;
        }
    }
}
