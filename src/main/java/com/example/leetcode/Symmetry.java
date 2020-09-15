/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: symmetry Author: xutong Date: 2020/4/3 10:19 上午
 * Description: 最长回文字符串 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.leetcode;

/**
 * 〈一句话功能简述〉<br>
 * 〈最长回文字符串〉
 *
 * @author xutong
 * @create 2020/4/3
 * @since 1.0.0
 */
public class Symmetry {
    /**
     * 将字符创反转
     *
     * @param s
     * @return
     */
    public  String longestPalindrome(String s) {
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >=i+maxStr.length(); j--) {
                if (j-i <= maxStr.length()){
                    break;
                }
                String substring = s.substring(i, j);
                if ( isPalindrome(substring)) {
                    maxStr = substring;
                }
            }
        }
        return maxStr;
    }
    // 是否是回文
    private  Boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }


}
