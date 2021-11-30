package com.example.design_pattern.heap;

import java.util.Arrays;

/**
 * 二差堆数据结构
 *
 * @author xutong
 */
public class HeapBoot {
    private int[] array;
    private int size;

    public HeapBoot() {
        this.array = new int[32];
    }

    public void enQueue(int key) {
        if (size >= array.length) {
            resize();
        }
        array[size++] = key;
        upAdjust();
    }

    public int deQueue() throws Exception {
        if (size <= 0) {
            throw new Exception("the queue is empty");
        }
        int head = array[0];
//        move tail value to the head
        array[0] = array[--size];
        downAdjust();
        return head;
    }

    public void upAdjust() {
        int childIndex = size - 1;
        int parentIndex = getParentIndex(childIndex);
        int temp = array[childIndex];
        //set the largest child be head until temp larger than both child set the temp be head
        while (childIndex > 0 && temp > array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = getParentIndex(childIndex);
        }
        array[childIndex] = temp;
    }

    private void downAdjust() {
        int parentIndex = 0;
        int temp = array[parentIndex];
        while (leftChildIndex(parentIndex) < size && temp < array[largestChildIndex(parentIndex)]) {
            array[parentIndex] = array[largestChildIndex(parentIndex)];
            parentIndex = largestChildIndex(parentIndex);
        }
        array[parentIndex] = temp;

    }

    private void resize() {
        int newSize = this.size * 2;
        this.array = Arrays.copyOf(this.array,newSize);
    }


    private int largestChildIndex(int parentIndex) {
        return array[leftChildIndex(parentIndex)] > array[rightChildIndex(parentIndex)] ? leftChildIndex(parentIndex) : rightChildIndex(parentIndex);
    }

    private static int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private static int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private static int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }
}
