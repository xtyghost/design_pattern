package com.example.top100;

import com.alibaba.fastjson.JSONArray;

/**
 * 矩阵置零
 */
public class Hot73_1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}; //[[1,0,1],[0,0,0],[1,0,1]]
        Hot73_1 hot731 = new Hot73_1();
        hot731.setZeroes(matrix);
        System.out.println(JSONArray.toJSONString(matrix));
    }

    public void setZeroes(int[][] matrix) {
        boolean row1 = false;
        boolean line1 = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                line1 = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                row1 = true;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int y = 1; y < n; y++) {
                if (matrix[i][y] == 0) {
                    matrix[0][y] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int y = 1; y < n; y++) {
                    matrix[i][y] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                for (int y = 1; y < m; y++) {
                    matrix[y][i] = 0;
                }
            }
        }
        if (row1) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }

        }
        if (line1) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] =0;
            }
        }
    }


}
