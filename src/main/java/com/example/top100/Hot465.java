package com.example.top100;

public class Hot465 {

    int sum = 0;

    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[0].length; i1++) {
                if (grid[i][i1] == 1) {
                    sum+=getShorelines(grid,i,i1);
                }
            }
        }
        return sum;
    }

    public int getShorelines(int[][] grid, int x, int y) {

        return isShoreline(grid, x - 1, y)
                + isShoreline(grid, x + 1, y)
                + isShoreline(grid, x, y - 1)
                + isShoreline(grid, x, y + 1);
    }

    public int isShoreline(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return 1;
        }
        return grid[x][y] == 0 ? 1 : 0;
    }
}
