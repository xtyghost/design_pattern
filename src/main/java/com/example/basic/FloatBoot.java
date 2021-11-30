package com.example.basic;

/**
 * @author xutong
 */
public class FloatBoot {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            System.out.println(System.identityHashCode(1.0 + i) & 15);
        }
    }
}
