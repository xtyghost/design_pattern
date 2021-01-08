/**
 * Copyright (C), 2015-2019, XXX有限公司 FileName: CyclicBarrier_test Author: xutong Date: 2019/12/20
 * 11:48 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉<br>
 * 〈舔狗的人生〉
 *
 * @author xutong
 * @create 2019/12/20
 * @since 1.0.0
 */
public class CyclicBarrier_test {
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
    AtomicInteger atomicInteger = new AtomicInteger(0);
    CountDownLatch countDownLatch = new CountDownLatch(1);

    CyclicBarrier cyclicBarrier =
        new CyclicBarrier(
            10,
            () -> {
              System.out.println("开门");
              countDownLatch.countDown();
            });
    for (int i = 0; i < 10; i++) {
      factory.execute(
          () -> {
            try {
              TimeUnit.SECONDS.sleep(10);
              synchronized (cyclicBarrier) {
                System.out.println(cyclicBarrier.getNumberWaiting());
                System.out.printf(
                    "%s是第%d个报道的 \r\n",
                    Thread.currentThread().getName(), atomicInteger.incrementAndGet());
              }
              cyclicBarrier.await();
              System.out.println("老板好，老板辛苦了");
            } catch (InterruptedException | BrokenBarrierException e) {
              e.printStackTrace();
            }
          });
      //
    }
    countDownLatch.await();
    System.out.println("老板，今天开门真早");

    //
  }
}
