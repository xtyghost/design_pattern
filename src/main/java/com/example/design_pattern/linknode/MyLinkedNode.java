package com.example.design_pattern.linknode;

/**
 * @author xutong
 */
public class MyLinkedNode {

    private Node head;
    private Node last;
    private int size;

    public void insert(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表范围");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            //头插入
            insertNode.next = head;
            head = insertNode;
        } else if (size == index) {
            //尾插入
            last.next = insertNode;
            last = insertNode;
        } else {
            //中间插入
            Node prevNode = get(index - 1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size++;
    }

    public Node remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node removeNode = null;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            Node preNode = get(index - 1);
            removeNode = preNode.next;
            preNode.next = null;
            last = preNode;
        } else {
            Node prevNode = get(index - 1);
            Node nextNode = prevNode.next.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    public Node get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 输出链表
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) throws Exception {
        MyLinkedNode myLinkedNode = new MyLinkedNode();
        myLinkedNode.insert(3,0);
        myLinkedNode.insert(7,1);
        myLinkedNode.insert(9,2);
    }
}
