package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        mergeSort2(arr, l, mid, r);
    }

    /**
     * 指定的插入排序
     *
     * @param arr
     * @param l
     * @param m
     * @param r
     */
    private static void mergeSort(int[] arr, int l, int m, int r) {
        for (int i = m; i <= r; i++) {
            int j = i;
            int jV = arr[j];
            while (j > l && arr[j] < arr[j - 1]) {
                arr[j] = arr[j - 1];
                arr[j - 1] = jV;
                j--;
            }
            arr[j] = jV;
        }
    }

    private static void mergeSort2(int[] arr, int l, int m, int r) {
        int[] lArr = new int[m - l+1];
        int[] rArr = new int[r - m ];
        System.arraycopy(arr, l, lArr, 0, m - l+1);
        System.arraycopy(arr, m + 1, rArr, 0, r - m );
        int left = 0;
        int right = 0;
        for (int i = l; i < r + 1; i++) {
            if (left == lArr.length) {
                arr[i] = rArr[right];
                right++;
                continue;
            }
            if (right == rArr.length) {
                arr[i] = lArr[left];
                left++;
                continue;
            }
            if (lArr[left] > rArr[right]) {
                arr[i] = rArr[right];
                right++;
            } else {
                arr[i] = lArr[left];
                left++;
            }

        }

    }
}
