package com.example.arithmetic.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 字典序算法
 * “找出这个正整数所有数字全排列的下一个数”
 *  一个整数在顺序情况下最小
 *  在逆序情况下最大
 *  找到全排列的下一个数字的关键在于确定逆序的范围
 *
 * @author xutong
 */
public class FindNearestNumber {

    public int[] findNearestNumber(int[] numbers){


        int nearestNumber = findTransferPoint(numbers);
        if (nearestNumber == 0){
            return null;
        }
        int[] numbersCopy  = Arrays.copyOf(numbers,numbers.length);
        //
        exchangeHead(numbersCopy,nearestNumber);
        reverse(numbersCopy,nearestNumber);
        return numbersCopy;

    }

    /**
     * 倒序
     * @param numbersCopy
     * @param nearestNumber
     */
    private void reverse(int[] numbersCopy, int nearestNumber) {
        for (int i = nearestNumber, j = numbersCopy.length -1; i <j ; i++,j--) {
            int tmp = numbersCopy[i];
            numbersCopy[i] = numbersCopy[j];
            numbersCopy[j] = tmp;
        }
    }


    private static  int findTransferPoint(int[] numbers){
        for (int i = numbers.length-1; i >0; i--) {
            if (numbers[i]>numbers[i-1]){
                return i;
            }
        }
        return  0;
    }
    private static void exchangeHead(int[] numbers, int index){
        int head = numbers[index -1];
        for (int i = numbers.length -1 ; i >0; i--) {
            if (numbers [i]>head){
                numbers[index -1] = numbers[i];
                numbers[i] = head;
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,9,6,5,6};
        System.out.println(Arrays.stream(new FindNearestNumber().findNearestNumber(numbers)).mapToObj(a->a+"").collect(Collectors.joining(",")));
    }

}
