/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Print100 Author: xutong Date: 2020/11/17 7:48 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.test;

/**
 * 〈一句话功能简述〉<br>
 * 〈打印100以内对奇偶数〉
 *
 * @author xutong
 * @create 2020/11/17
 * @since 1.0.0
 */
public class Print100 {
  private final Object lock = new Object();
  private int count = 0;

  public static void main(String[] args) throws InterruptedException {
      new Print100().turning();
  }

  public void turning() throws InterruptedException {
    new Thread(new TurningRunner(), "偶数").start();
    // 确保偶数线程线先获取到锁
    Thread.sleep(1);
    new Thread(new TurningRunner(), "奇数").start();
  }

  class TurningRunner implements Runnable {
    @Override
    public void run() {
      while (count <= 100) {
        // 获取锁
        synchronized (lock) {
          // 拿到锁就打印
          System.out.println(Thread.currentThread().getName() + ": " + count++);
          // 唤醒其他线程
          lock.notifyAll();
          try {
            if (count <= 100) {
              // 如果任务还没有结束，则让出当前的锁并休眠
              lock.wait();
            }
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
