package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

/**
 * @author xutong
 */
public class Q4_344 {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        new Q4_344().reverseString(chars);
        System.out.println(new JSONArray(chars));
    }
    public void reverseString(char[] s) {
        char tmp ='0';
        for (int i = 0; i < (s.length>>1); i++) {
            tmp= s[i];
            s[i]= s[s.length-1-i];
            s[s.length-1-i]=tmp;
        }

    }
}
