package com.example.arithmetic;

/**
 * @author xutong
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci3(6));
    }

    public static int fibonacci(int n){
        int[] arr = new int[n];
        arr[0] =1;
        arr[1] =1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] +arr[i-2];
        }
        return arr[n-1];
    }
    public static int fibonacci2(int n){
            if (n<=1){
                return 1;
            }
        return fibonacci2(n-1)+fibonacci2(n-2);
    }
    public static int fibonacci3(int n){
        if (n<=1){
            return 1;
        }
       int arr1 =1;
        int arr2 =1;
        int tmp;

        for (int i = 2; i < n; i++) {
            tmp = arr2;
            arr2 = arr1 +arr2;
            arr1 =tmp;
        }
        return arr2;
    }
}
