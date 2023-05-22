package com.example.geekbang1.day15;

/**
 * pow(x,n)
 * @author xutong
 */
public class Q15_50_2 {
    public static void main(String[] args) {
        System.out.println(new Q15_50_2().myPow(2.00000,
                -2));
    }

    public double myPow(double x, int n) {
        return myPow(x,x,n);
    }
    public double myPow(double x,double y, int n) {
        if (y==1){
            return 1;
        }
        if (n==1){
            return x;
        }else if (n==0){
            return 1;
        }else if (n==-1){
            return 1/y;
        } else {
            double v = myPow(x, y, n / 2);
            return v *v* myPow(x,y,n%2);
        }
    }

}
