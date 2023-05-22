package com.example.studyplan_1;

/**
 * 第一个错误版本
 * @author xutong
 */
public class Q1_278 {

    public static void main(String[] args) {
        int i = new Q1_278().firstBadVersion(1);
    }

    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (right>left){
            int mid = left +(right-left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }else {
                left = mid++;
            }
        }
        return left;

    }

    public boolean isBadVersion(int version){
        return false;
    }
}
