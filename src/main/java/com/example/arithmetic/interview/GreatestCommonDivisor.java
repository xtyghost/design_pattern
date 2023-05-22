package com.example.arithmetic.interview;

/**
 * @author xutong
 */
public class GreatestCommonDivisor {


    /**
     * educlidean algorithm
     * @param a
     * @param b
     * @return
     */
    public static int getGreatestCommonDivisor(int a, int b){
        if(a == b ){
            return a;
        }
        if ((a&1)==0&&(b&1)==0){
            return getGreatestCommonDivisor(a>>1,b>>1)<<1;
        }else if((a&1)==0&&(b&1)!=0){
            return getGreatestCommonDivisor(a>>1,b);
        }else if ((a&1)!=0&&(b&1)==0){
            return getGreatestCommonDivisor(a,b>>1);
        }else {
           return getGreatestCommonDivisor2(a,b);
        }
    }
    /**
     * educlidean algorithm
     * @param a
     * @param b
     * @return
     */
    public static int getGreatestCommonDivisor1(int a, int b){
        int max = getMax(a,b);
        int min = getMin(a,b);
        if (max%min == 0){
            return min;
        }
        int c = max%min;


        return getGreatestCommonDivisor1(c,min);
    }
    /**
     * 更相减损法
     * @param a
     * @param b
     * @return
     */
    public static int getGreatestCommonDivisor2(int a, int b){
        if ( a== b){
            return a;
        }
        int max = getMax(a, b);
        int min = getMin(a, b);
        return getGreatestCommonDivisor2(max-min,min);
    }
    public static int getMax(int a, int b){
        return a>b?a:b;
    }
    public static int getMin(int a, int b){
        return a<b?a:b;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(342000, 340));
    }
}
