package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int arr[]) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int smallerArrNextRIndex = partition(arr, l, r);
        // deduct 2 ,1 for let r don't involve sorting, another one for smallerArrNextRIndex is NextRIndex
        sort(arr, l, smallerArrNextRIndex - 2);
        sort(arr, smallerArrNextRIndex , r);
    }

    private static int partition(int[] arr, int l, int r) {
        int smallerArrNextRIndex = l;
        int tmp;
        int pivotV = arr[r];
        for (int i = l; i <= r; i++) {
            if (arr[i] <= pivotV) {
                tmp = arr[smallerArrNextRIndex];
                arr[smallerArrNextRIndex] = arr[i];
                arr[i] = tmp;
                smallerArrNextRIndex++;
            }
        }
        return smallerArrNextRIndex;
    }
}
