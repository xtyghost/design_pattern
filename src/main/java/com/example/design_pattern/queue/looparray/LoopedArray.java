package com.example.design_pattern.queue.looparray;

/**
 * 基于循环列表实现队列
 *
 * @author xutong
 */
public class LoopedArray {

    private int[] array;
    private int front;
    private int rear;

    public LoopedArray(int capacity) {
        this.array = new int[capacity];
    }

    /**
     * 入队
     *
     * @param element
     * @throws Exception
     */
    public void enQueue(int element) throws Exception {
        if (increaseAndGetIndex(rear) == front) {
            throw new Exception("队列已经满了！");
        }
        array[rear] = element;
        rear = increaseAndGetIndex(rear);
    }

    /**
     * 出队
     *
     * @return
     * @throws Exception
     */
    public int deQueue() throws Exception {
        if (front == rear) {
            throw new Exception("队列已经空了！");
        }
        int deQueueElement = array[front];
        front = increaseAndGetIndex(front);
        return deQueueElement;
    }

    private int increaseAndGetIndex(int index) {
        return (index + 1) % array.length;
    }

    public void print() {
        for (int i = front; i < rear; i = increaseAndGetIndex(i)) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        LoopedArray loopedArray = new LoopedArray(6);
        for (int i = 0; i < 5; i++) {
            loopedArray.enQueue(i);
        }
        loopedArray.deQueue();
        loopedArray.print();
    }
}
