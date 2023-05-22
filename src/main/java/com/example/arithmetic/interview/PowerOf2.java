package com.example.arithmetic.interview;

/**
 * @author xutong
 */
public class PowerOf2 {
    public static boolean isPowerOf2(int num){
        return (num&num-1) ==0;
    }
}
