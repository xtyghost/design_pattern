package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class Hot54_1 {
    public static void main(String[] args) {

        Hot54_1 hot541 = new Hot54_1();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(JSONArray.toJSONString(hot541.spiralOrder(matrix)));
        System.out.println(JSONArray.toJSONString(hot541.spiralOrder(matrix2)));
        System.out.println(JSONArray.toJSONString(hot541.spiralOrder(matrix3)));

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int l = 0;
        boolean flag = true;
        while (flag) {
            // ->
            for (int i = l; i < n; i++) {
                if (matrix[r][i] == 200) {
                    break;
                }
                list.add(matrix[r][i]);
                matrix[r][i] = 200;
                l = i;
            }
            // down
            for (int y = r + 1; y < m; y++) {
                if (matrix[y][l] == 200) {
                    break;
                }
                list.add(matrix[y][l]);
                matrix[y][l] = 200;
                r = y;
            }
            // <-
            for (int i = l - 1; i >= 0; i--) {
                if (matrix[r][i] == 200) {
                    break;
                }
                list.add(matrix[r][i]);
                matrix[r][i] = 200;
                l = i;
            }
            // up
            for (int y = r - 1; y >= 0; y--) {
                if (matrix[y][l] == 200) {
                    break;
                }
                list.add(matrix[y][l]);
                matrix[y][l] = 200;
                r = y;
            }
            l++;
            if (list.size() == m * n) {
                flag = false;
            }
        }
        return list;
    }
}
