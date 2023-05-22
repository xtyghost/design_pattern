package com.example.arithmetic.dp.chapter2;

import org.springframework.util.Assert;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * <p>
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * <p>
 * 作者：宫水三叶
 * 链接：https://leetcode.cn/leetbook/read/path-problems-in-dynamic-programming/rt1hg6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution1 {
    public static void main(String[] args) {
        int[][] obstacleGrid1 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] obstacleGrid2 = new int[][]{{0, 1}, {0, 0}};
        Solution1 solution = new Solution1();
        Assert.isTrue(solution.uniquePathsWithObstacles(obstacleGrid1) == 2, "error");
        Assert.isTrue(solution.uniquePathsWithObstacles(obstacleGrid2) == 1, "error");
        String  a = "";
        switch (a){
            case "":
            case "1":
        }
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 1 && obstacleGrid[0].length == 1) {
            return obstacleGrid[0][0] == 0 ? 1 : 0;
        }
        int[][] dummyArray = wrapper(obstacleGrid);
        for (int i = 1; i < dummyArray.length; i++) {
            for (int y = 1; y < dummyArray[0].length; y++) {
                if (dummyArray[i][y] == 0) {
                    dummyArray[i][y] = Math.max(dummyArray[i - 1][y], 0) + Math.max(dummyArray[i][y - 1], 0);
                }
            }
        }
        return Math.max(dummyArray[obstacleGrid.length][obstacleGrid[0].length], 0);
    }

    /**
     * 生成包装对象
     *
     * @param obstacleGrid
     * @return
     */
    private int[][] wrapper(int[][] obstacleGrid) {
        int[][] ints = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int y = 0; y < obstacleGrid[0].length; y++) {
                ints[i + 1][y + 1] = obstacleGrid[i][y] == 0 ? 0 : -1;
            }
        }
        if (ints[1][1] != -1) {
            ints[1][1] = 1;
        }
        return ints;
    }
}
