package com.example.arithmetic.dp.chapter1;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * <p>
 * 问总共有多少条不同的路径？
 * <p>
 * 作者：宫水三叶
 * 链接：https://leetcode.cn/leetbook/read/path-problems-in-dynamic-programming/rtwu06/
 * 来源：力扣（LeetCode）
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.uniquePaths(3,3));
//        Assert.isTrue(solution1.uniquePaths(3,7)==28,"error");
//        Assert.isTrue(solution1.uniquePaths(3,2)==3,"error");
//        Assert.isTrue(solution1.uniquePaths(7,3)==28,"error");
    }
    public int uniquePaths(int m, int n) {
        if (m == 1) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
}
