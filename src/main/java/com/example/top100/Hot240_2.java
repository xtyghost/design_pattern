package com.example.top100;

import com.alibaba.fastjson.JSONArray;

/**
 * 三数只和
 */
public class Hot240_2 {
    public static void main(String[] args) {
        Hot240_2 hot240 = new Hot240_2();
        int[][] matrix =
                {{-1, 2,5}};
        int target = 3;

        System.out.println(JSONArray.toJSONString(hot240.searchMatrix(matrix, target)));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while (x < m && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] < target) {
                x++;
            } else {
                y--;
            }
        }
        return false;
    }

}
