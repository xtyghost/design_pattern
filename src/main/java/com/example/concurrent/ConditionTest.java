/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ConditionTest
 * Author:   xutong
 * Date:     2020/10/28 11:20 上午
 * Description: 测试lock的condition
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试lock的condition〉
 *
 * @author xutong
 * @create 2020/10/28
 * @since 1.0.0
 */
public class ConditionTest {
  public static void main(String[] args) {
    //
//      ReentrantLock reentrantLock = new ReentrantLock();
//      Condition condition = reentrantLock.newCondition();
    System.out.println((Integer.toBinaryString(new Object().hashCode() )+"").length());
  }
}