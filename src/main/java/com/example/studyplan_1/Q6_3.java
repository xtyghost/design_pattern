package com.example.studyplan_1;

/**
 * @author xutong
 */
public class Q6_3 {
    public static void main(String[] args) {
        int i = new Q6_3().lengthOfLongestSubstring(" ");
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int maxLength =0;
        int currentLength= 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ind = s.substring(left, i).indexOf(c);//下一个重复文本的相对位置
            if (ind ==-1){
                currentLength++;
                continue;
            }

            left= ind+1+left; //从左边加一个开始重新计算
            maxLength = Math.max(maxLength,currentLength);
            currentLength=i-left+1;//长度+1
        }
        maxLength = Math.max(maxLength,currentLength);
        return maxLength;
    }

}
