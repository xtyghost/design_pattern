package com.example.arithmetic.interview;

/**
 * @author xutong
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Integer smallestLength = getSmallestLength(strs);
        Integer large = smallestLength;
        int small = 0;
        boolean flag = !isLongestCommonPrefix(large, strs);

        while (flag) {
            smallestLength = (large + small) >> 1;
            boolean commonPrefix = isLongestCommonPrefix(smallestLength, strs);
            if (commonPrefix){
                if (smallestLength == small){
                    break;
                }
                small = smallestLength;
            }else {
                if (smallestLength == large){
                    break;
                }
                large = smallestLength;
            }
        }

        return strs[0].substring(0,smallestLength);
    }

    private boolean isLongestCommonPrefix(Integer smallestLength, String[] strs) {
        String substring = strs[0].substring(0, smallestLength);
        for (String str : strs) {
            if (!str.startsWith(substring)){
                return false;
            }
        }
        return true;
    }

    public Integer getSmallestLength(String[] strs ){
        int len =300;
        for (String str : strs) {
            if (len>str.length()){
                len = str.length();
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
