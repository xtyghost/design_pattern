package com.example.top100;

public class Hot695 {
    int maxArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int y = 0; y < grid[0].length; y++) {
                maxArea = Math.max(maxAreaOfIsland(grid, i, y), maxArea);
            }
        }
        return maxArea;
    }

    public int maxAreaOfIsland(int[][] grid, int x, int y) {
        if (isIllegal(grid, x, y) || isWater(grid, x, y) || isCount(grid, x, y)) {
            return 0;
        }
        grid[x][y] = 2;
        return 1 +
                maxAreaOfIsland(grid, x - 1, y) +
                maxAreaOfIsland(grid, x + 1, y) +
                maxAreaOfIsland(grid, x, y + 1) +
                maxAreaOfIsland(grid, x, y - 1);
    }

    public boolean isIllegal(int[][] grid, int x, int y) {
        return x < 0 || x >= grid.length || y < 0 || y >= grid[0].length;
    }

    public boolean isWater(int[][] grid, int x, int y) {
        return grid[x][y] == 0;
    }

    public boolean isCount(int[][] grid, int x, int y) {
        return grid[x][y] == 2;
    }

}
