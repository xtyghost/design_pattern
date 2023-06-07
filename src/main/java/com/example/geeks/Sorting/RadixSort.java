package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;

import java.util.LinkedList;


public class RadixSort {


    // utility function to get the number of digits in the
    // max_element
    static int digits(int n) {
        int i = 1;
        if (n < 10)
            return 1;

        while (n > Math.pow(10, i))
            i++;

        return i;
    }

    public static void radixSort(int[] arr) {
        // size of the array to be sorted
        int sz = arr.length;

        // getting the maximum element in the array
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < sz; i++)
            max_val = Math.max(max_val, arr[i]);

        // getting digits in the maximum element
        int d = digits(max_val);

        // creating buckets to store the pointers
        LinkedList<Integer>[] bins = new LinkedList[10];
        for (int i = 0; i < 10; i++)
            bins[i] = new LinkedList<Integer>();

        // first loop working for a constant time only and
        // inner loop is iterating through the array to
        // store elements of array in the linked list by
        // their digits value
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < sz; j++) {
                int digit
                        = (arr[j] / (int) Math.pow(10, i)) % 10;
                bins[digit].add(arr[j]);
            }

            int x = 0, y = 0;
            // write back to the array after each pass
            while (x < 10) {
                while (!bins[x].isEmpty()) {
                    arr[y] = bins[x].remove();
                    y++;
                }
                x++;
            }
        }
    }

    // a utility function to print the sorted array
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {573, 25, 415, 12, 161, 6};

        // function call
        radixSort(arr);
        printArr(arr);
    }

}
