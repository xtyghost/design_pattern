package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数只和
 */
public class Hot240 {
    public static void main(String[] args) {
        Hot240 hot240 = new Hot240();
        int[][] matrix =
                {{-1,3}};
        int target = 3;

        System.out.println(JSONArray.toJSONString(hot240.searchMatrix(matrix, target)));
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0][0] > target) {
            return false;
        }
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int l = 0;
        int r = m;
        int x = getX(matrix, 0, l, r, target);
        if (x == -1) {
            return true;
        }
        l = 0;
        r = n;
        int y = getY(matrix, 0, l, r, target);
        if (y == -1) {
            return true;
        }
        l = 0;
        r = y;
        int z = getY(matrix, x, l, r, target);
        if (z == -1) {
            return true;
        }
        l = 0;
        r = x;
        int g = getX(matrix, y, l, r, target);
        if (g == -1) {
            return true;
        }

        for (int i = z; i <= y; i++) {
            for (int i1 = g; i1 <= x; i1++) {
                if (matrix[i1][i] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int getY(int[][] matrix, int x, int l, int r, int target) {
        if (matrix[x][l]==target||matrix[x][r]==target){
            return -1;
        }
        while (matrix[x][l] < target && matrix[x][r] > target ) {
            if (r == l + 1) {
                return l;
            }
            int mid = (l + r) / 2;
            if (matrix[x][mid] == target) {
                return -1;
            } else if (matrix[x][mid] > target) {
                r = mid;
            } else {
                l = mid;
            }
        }

        return r;
    }

    private static int getX(int[][] matrix, int y, int l, int r, int target) {
        if (matrix[l][y]==target||matrix[r][y]==target){
            return -1;
        }
        while (matrix[l][y] < target && matrix[r][y] > target) {
            if (r == l + 1) {
                return l;
            }
            int mid = (l + r) / 2;
            if (matrix[mid][y] == target) {
                return -1;
            } else if (matrix[mid][y] > target) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }
}
