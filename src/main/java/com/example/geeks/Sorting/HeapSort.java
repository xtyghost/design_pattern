package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int[] arr) {
        Heap heap = new Heap(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.remove();
        }
    }

    // smallest heap
    public static class Heap {
        int[] arr;
        int targetIndex = 0;

        public Heap(int[] array) {
            this.arr = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                add(array[i]);
            }
        }

        public void add(int v) {
            arr[targetIndex] = v;
            int i = targetIndex;
            while (arr[parentIndex(i)] > v) {
                arr[i] = arr[parentIndex(i)];
                arr[parentIndex(i)] = v;
                i = parentIndex(i);
            }
            targetIndex++;
        }

        public int remove() {
            if (targetIndex <= 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int value = arr[0];
            arr[0] = arr[targetIndex - 1];
            heapify(0);
            targetIndex--;
            return value;
        }

        public void heapify(int i) {
            int childIndex = getSmallestChildIndex(i);
            if (childIndex == i) {
                return;
            }
            int tmp = arr[i];
            arr[i] = arr[childIndex];
            arr[childIndex] = tmp;
            heapify(childIndex);
        }

        private int getSmallestChildIndex(int i) {
            return arr[leftChildIndex(i)] > arr[rightChildIndex(i)] ? rightChildIndex(i) : leftChildIndex(i);

        }

        public int leftChildIndex(int root) {
            return Math.min(2 * root + 1, targetIndex - 1);
        }

        public int rightChildIndex(int root) {
            return Math.min(2 * (root + 1), targetIndex - 1);
        }

        public int parentIndex(int child) {
            return Math.max((child + 1) / 2 - 1, 0);
        }

    }
}
