package com.example.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.*;

/**
 * @author xutong
 */
@Slf4j
public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Long> task = new FutureTask<Long>(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                log.info("1========={}", LocalDateTime.now());
                TimeUnit.SECONDS.sleep(1);
                return LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
            }
        });
        task.run();
        System.out.println(task.get());
        task.run();
        System.out.println(task.get());

    }
}
