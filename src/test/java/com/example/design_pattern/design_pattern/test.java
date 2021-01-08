/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: test
 * Author:   xutong
 * Date:     2019-06-27 18:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-06-27
 * @since 1.0.0
 */
public class test {
    //    public static void main(String[] args) {
////        System.out.println(new BCryptPasswordEncoder().encode("lisu"));
////    }
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();

        synchronized (o) {
            o.wait();
            LinkedBlockingDeque<Object> objects = new LinkedBlockingDeque<>();
            objects.offer("");
            objects.put("");

        }

    }

    @Test
    public void test1() {
//        ThreadPoolExecutor threadPoolExecutor1 = new ThreadPoolExecutor();
        ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(10);
//        threadPoolExecutor.sche
        threadPoolExecutor.schedule(() -> {
            System.out.println(Thread.currentThread());
        }, 60, TimeUnit.SECONDS);
//        threadPoolExecutor.scheduleWithFixedDelay()
        threadPoolExecutor.execute(()->{});
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{System.out.println(Thread.currentThread());});
    }
}