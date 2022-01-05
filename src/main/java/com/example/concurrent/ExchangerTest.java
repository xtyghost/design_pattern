package com.example.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * “Exchanger（交换者）是一个用于线程间协作的工具类。Exchanger用于进行线程间的数据交换。它提供一个同步点，在这个同步点，两个线程可以交换彼此的数据。这两个线程通过exchange方法交换数据，如果第一个线程先执行exchange()方法，它会一直等待第二个线程也执行exchange方法，当两个线程都到达同步点时，这两个线程就可以交换数据，将本线程生产出来的数据传递给对方”
 * <p>
 * Excerpt From
 * Java并发编程的艺术 (Java核心技术系列)
 * 方腾飞,魏鹏,程晓明 著
 * This material may be protected by copyright.
 *
 * @author xutong
 */
@Slf4j
public class ExchangerTest {
    private static final Exchanger<String> exgr = new Exchanger<>();
    private static final ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String A ="A";
                try {
                    exgr.exchange(A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String B ="B";
                try {
                    String exchange = exgr.exchange(B);
                    log.info("A====={}；B====={}",exchange,B);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();
    }
}
