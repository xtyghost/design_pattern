/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: WaitTest Author: xutong Date: 2020/10/28 10:20 上午
 * Description: 测试object的await方法 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.concurrent;

import javax.sound.midi.Soundbank;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试object的wait方法〉
 * wait方法会释放发起wait()对象的锁（如果当线程持有）把当前线程放入该对象的wait set
 * 但不会释放该线程持有的其它的对象的锁
 * @author xutong
 * @create 2020/10/28
 * @since 1.0.0
 */
public class WaitTest {
  public static void main(String[] args) throws InterruptedException {
    Object o1 = new Object();
    Object o2 = new Object();
    new Thread(
            () -> {
              synchronized (o1) {
                synchronized (o2) {
                  try {
                    System.out.println("I'm wait");
                    o2.wait();
                      o1.wait();
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
                }
              }
            })
        .start();
      Thread i_want_do_something = new Thread(
              () -> {
                  try {
                      TimeUnit.SECONDS.sleep(1);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  synchronized (o1) {
                      o1.notify();
                      System.out.println("I want do Something");
                  }
              });
      i_want_do_something
        .start();
      i_want_do_something.join();
  }
}
