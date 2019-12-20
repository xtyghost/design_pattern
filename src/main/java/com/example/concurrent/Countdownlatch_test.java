/**
 * Copyright (C), 2015-2019, XXX有限公司 FileName: countdownlatch_test Author: xutong Date: 2019/12/20
 * 11:07 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019/12/20
 * @since 1.0.0
 */
public class Countdownlatch_test {
  public static ThreadPoolExecutor factory =
      new ThreadPoolExecutor(
          10,
          10,
          1,
          TimeUnit.SECONDS,
          new LinkedBlockingDeque<>(10),
          new ThreadFactory() {
            private final ThreadGroup group;
            private final AtomicInteger index = new AtomicInteger(1);

            {
              SecurityManager s = System.getSecurityManager();
              group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
            }

            @Override
            public Thread newThread(Runnable r) {
              Thread t = new Thread(group, r, "Roast-chicken-worker" + index.getAndIncrement());
              t.setDaemon(true);
              return t;
            }
          },
          new ThreadPoolExecutor.AbortPolicy());

  public static void main(String[] args) throws InterruptedException {

    CountDownLatch countDownLatch1 = new CountDownLatch(1);
    CountDownLatch countDownLatch2 = new CountDownLatch(10);
      AtomicInteger counts = new AtomicInteger(0);

      //      factory.prestartAllCoreThreads()
    System.out.println("老板，来十份烤鸡，熟的——''--");
    for (int i = 0; i < 10; i++) {
      factory.execute(
          () -> {
            try {
              countDownLatch1.await();//此处可能不同步
              TimeUnit.SECONDS.sleep(1);
              System.out.println("a new chicken");
              countDownLatch2.countDown();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          });
    }
    TimeUnit.SECONDS.sleep(10);
    countDownLatch1.countDown();

    countDownLatch2.await();
    System.out.println("美味");
  }
}
