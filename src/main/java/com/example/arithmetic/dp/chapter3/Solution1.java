package com.example.arithmetic.dp.chapter3;

import org.springframework.util.Assert;

/**
 * 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
        Assert.isTrue(solution.minPathSum(grid1) == 7, "error");
        Assert.isTrue(solution.minPathSum(grid2) == 12, "error");
    }

    public int minPathSum(int[][] grid) {
        int[][] dummyArray = wrap(grid);
        for (int x = 1; x < dummyArray.length; x++) {
            for (int y = 1; y < dummyArray[0].length; y++) {
                if (x == 1 && y == 1) {
                    continue;
                }
                dummyArray[x][y] = Math.min(dummyArray[x - 1][y], dummyArray[x][y - 1]) + dummyArray[x][y];
            }
        }
        return dummyArray[grid.length][grid[0].length];
    }

    private int[][] wrap(int[][] grid) {
        int[][] ints = new int[grid.length + 1][grid[0].length+1];
        for (int i = 0; i < ints.length; i++) {
            for (int y = 0; y < ints[0].length; y++) {
                if (y == 0 || i == 0) {
                    ints[i][y] = Integer.MAX_VALUE;
                } else {
                    ints[i][y] = grid[i - 1][y - 1];
                }
            }

        }
        return ints;
    }
}
