package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int arr[]) {
        int tmp;
        boolean swapped = true;
        int unSortedLen = arr.length;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < unSortedLen - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
            unSortedLen--;
        }

    }
}
