package com.example.geekbang1.day15;

/**
 * pow(x,n)
 * @author xutong
 */
public class Q15_50_1 {
    public static void main(String[] args) {
        System.out.println(new Q15_50_1().myPow(1.08, 12)*1.25);
    }

    public double myPow(double x, int n) {
        return myPow(x,x,n);
    }
    public double myPow(double x,double y, int n) {
        if (n==1){
            return x;
        }else if (n>1){
            return myPow(x*y,y,--n);
        }else {
            return myPow(x/y,y,++n);
        }
    }
}
