package com.example.geekbang1.day13;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 * @author xutong
 */
public class Q13_78_2 {
    public static void main(String[] args) {
        System.out.println(new JSONArray(new Q13_78_2().subsets(new int[]{1, 2, 3})));
    }
        List<Integer> t = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        public List<List<Integer>> subsets(int[] nums) {
            dfs(0, nums);
            return ans;
        }

    /**
     *  {1}
     *  {1,2}
     *  {1,2,3}
     *  {1,2,3,4}
     * @param cur
     * @param nums
     */
    public void dfs(int cur, int[] nums) {
            if (cur == nums.length) {
                ans.add(new ArrayList<Integer>(t));
                return;
            }
            t.add(nums[cur]);//选cur的路线
            dfs(cur + 1, nums);
            t.remove(t.size() - 1);//不选cur的路线
            dfs(cur + 1, nums);
        }

}
