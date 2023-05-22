package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 理解二叉堆的遍历凡是
 * 堆排序
 *
 * @author xutong
 */
public class StackSort {


    public static int leftChild(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    public static int rightChild(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    public static int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public static int largestChildIndex(int[] array, int parentIndex ,int length) {
        if (length <= leftChild(parentIndex)) {
            return parentIndex;
        }
        if (length <= rightChild(parentIndex)) {
            return leftChild(parentIndex);
        }
        return array[leftChild(parentIndex)] > array[rightChild(parentIndex)] ? leftChild(parentIndex) : rightChild(parentIndex);
    }

    /**
     * 下沉调整
     *
     * @param array
     * @param parentIndex
     */
    public static void downAdjust(int[] array, int parentIndex,int length) {
        int parent = array[parentIndex];
        int largestChildIndex = largestChildIndex(array, parentIndex,length);
        if (parent >= array[largestChildIndex]) {
            return;
        }
        swap(array,parentIndex,largestChildIndex);
        downAdjust(array,largestChildIndex,length);
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    /**
     * 堆排序(最大堆)
     *
     * @param array
     */
    public static void heapSort(int[] array) {
        //构建最大堆
        for (int i = 0; i < array.length; i++) {
            downAdjust(array,array.length-1-i,array.length-1);
        }
        //遍历最大堆
        int end = array.length-1;
        for (int i = 0; i <= end;) {
            swap(array,i,end);
            //第三个参数需要传的是长度，不是所有
            downAdjust(array,0,end);
            end--;


        }
    }

    public static void main(String[] args) {
        int[] ints = {2, 7, 1, 12, 213, 23, 6, 8};
        heapSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
