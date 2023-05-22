package com.example.studyplan_1;

import java.util.HashMap;

/**
 * @author xutong
 */
public class Q6_3_2 {
    public static void main(String[] args) {
        int i = new Q6_3_2().lengthOfLongestSubstring("abcabcbb ");
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
            int left=0  ,maxlength=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)){
                left= Math.max(map.put(c,right),left)+1;//左偏移一位
            }else {
               map.put(c,right);
            }
            maxlength =  Math.max(maxlength,right-left+1);
        }

        return maxlength;
    }

}
