package com.example.studyplan_1;

/**
 * @author xutong
 */
public class Q4_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = new Q4_557().reverseWords(s);
        System.out.println(s1);
    }

    public String reverseWords(String s) {
        int left = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i]==' '){
                reverseString(chars,left,i-1);
                left=i+1;
            }
            if (i==s.length()-1){
                reverseString(chars,left,i);
            }
        }
        return new String(chars);
    }

    public void reverseString(char[] s,int left  ,int right) {
        while (right>left){
            char tmp = s[left];
            s[left] = s[right];
            s[right]= tmp;
            left++;
            right--;
        }

    }
}
