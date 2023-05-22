package com.example.geekbang1.day4;

/**
 * plus-one
 * @author xutong
 */
public class Q4_66_1 {
    public int[] plusOne(int[] digits) {
        int alter = 1;
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[digits.length - 1 - i]+alter;
            digits[digits.length - 1 - i]= digit%10;
            alter=digit/10;
            if (alter == 0){
                return digits;
            }
        }
        if (alter==0){
            return digits;
        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        System.arraycopy(digits,0,res,1,digits.length);
        return res;
    }
}
