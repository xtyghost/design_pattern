package com.example.offer;

public class Offer_29 {
    int[] arr;
    int level = 0;

    public int[] spiralOrder(int[][] matrix) {

        int height = matrix.length;
        if (height == 0) {
            return new int[0];
        }
        int width = matrix[0].length;
        arr = new int[width * height];
        int index = 0;
        while (true) {
            if (index == arr.length) {
                break;
            }
            // -->
            for (int i = level; i < width - level; i++) {
                arr[index++] = matrix[level][i];
            }
            if (index == arr.length) {
                break;
            }
            // down
            for (int i = level + 1; i < height - level; i++) {
                arr[index++] = matrix[i][width - 1 - level];
            }
            if (index == arr.length) {
                break;
            }
            // <--
            for (int i = level + 1; i < width - level; i++) {
                arr[index++] = matrix[height - 1 - level][width - 1 - i];
            }
            if (index == arr.length) {
                break;
            }
            // up
            for (int i = level + 1; i < height - 1 - level; i++) {
                arr[index++] = matrix[height - 1 - i][level];
            }
            level++;
        }
        return arr;
    }
}
