package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

/**
 * 轮转数组
 * @author xutong
 */
public class Q2_189 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
       int k = 3;
       new Q2_189().rotate(nums,k);
        System.out.println(new JSONArray(nums));
    }

        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            int count = gcd(k, n);
            for (int start = 0; start < count; ++start) {
                int current = start;
                int prev = nums[start];
                do {
                    int next = (current + k) % n;
                    int temp = nums[next];
                    nums[next] = prev;
                    prev = temp;
                    current = next;
                } while (start != current);
            }
        }

        public int gcd(int x, int y) {
            return y > 0 ? gcd(y, x % y) : x;
        }

}
