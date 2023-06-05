package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int arr[]) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int y = min + 1; y < arr.length; y++) {
                if (arr[y] < arr[min]) {
                    min = y;
                }
            }
            // swap arr[min] and arr[i]
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

    }
}
