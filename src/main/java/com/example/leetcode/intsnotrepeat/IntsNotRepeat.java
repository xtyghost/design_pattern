/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: IntsNotRepeat
 * Author:   xutong
 * Date:     2020/5/14 5:32 下午
 * Description: 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.leetcode.intsnotrepeat;


/**
 * 〈一句话功能简述〉<br> 
 * 〈在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字〉
 *
 * @author xutong
 * @create 2020/5/14
 * @since 1.0.0
 */
public class IntsNotRepeat {
  public static void main(String[] args) {

    System.out.println(findRepeatNum(new int[]{2,3,3,1,1,0,2,5}));
  }

  private static int findRepeatNum(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        //
        if (i==arr[i]){
            continue;
        }else {
            int true_position = swap(arr, i);
            if (arr[i]==arr[true_position]){
              return true_position;
          }else {
              i--;
          }
        }
    }
    return -1;
  }

    private static int swap(int[] arr, int i) {
        int true_position =arr[i];
        arr[i] =arr[true_position];
        arr[true_position] =true_position;
        return true_position;
    }


}