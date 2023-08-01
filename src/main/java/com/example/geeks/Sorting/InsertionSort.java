package com.example.geeks.Sorting;


import com.alibaba.fastjson.JSONArray;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int[] arr) {
        int tmp;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            for (int y = i - 1; y >= 0; y--) {
                if (arr[y] > tmp) {
                    arr[y + 1] = arr[y];
                } else {
                    arr[y + 1] = tmp;
                    break;
                }
                if (y == 0) {
                    arr[0] = tmp;
                }
            }

        }

    }
}
