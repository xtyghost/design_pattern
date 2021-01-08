/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyObserver
 * Author:   xutong
 * Date:     2020/11/1 10:24 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.observer.v3;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class XtyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
    }
}