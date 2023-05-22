package com.example.studyplan_2;

import java.util.HashMap;

/**
 * @author xutong
 */
public class Q1_217 {
    public static void main(String[] args) {

        System.out.println(new Q1_217().containsDuplicate(new int[]{1, 2, 3, 1}));
    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.put(num,num) !=null) {
                return true;
            }
        }
        return false;
    }
}
