package com.example.arithmetic.dp.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 * <p>
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 * <p>
 * 作者：宫水三叶
 * 链接：https://leetcode.cn/leetbook/read/path-problems-in-dynamic-programming/rtfiiv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Integer[][] triangle1 = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        Integer[][] triangle2 = {{-10}};
//        Assert.isTrue(solution.minimumTotal(array2List(triangle1))==1,"error");
//        Assert.isTrue(solution.minimumTotal(array2List(triangle2))==2,"error");
        List<List<Integer>> wrap = solution.wrap(array2List(triangle1));

    }
    public static List<List<Integer>> array2List(Integer[][] triangle){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < triangle.length; i++) {
            list.add(Arrays.asList(triangle[i]));
        }
        return list;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        return 0;
    }
    public List<List<Integer>> wrap(List<List<Integer>> triangle){
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.addAll(triangle.get(i));
            list.add(0);
            lists.add(list);
        }
        return lists;
    }
}
