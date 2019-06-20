/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DubleCheckSingleton
 * Author:   xutong
 * Date:     2019-04-09 10:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.dependenceinversion;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-09
 * @since 1.0.0
 */
public class DubleCheckSingleton implements Serializable {
    //禁止指令重新排序
    private volatile static DubleCheckSingleton DUBLE_CHECK_SINGLETON;

    private DubleCheckSingleton() {
    }

    public static DubleCheckSingleton getInstance() {
        if (DUBLE_CHECK_SINGLETON == null) {
            synchronized (DubleCheckSingleton.class) {
                if (DUBLE_CHECK_SINGLETON == null) {
                    DUBLE_CHECK_SINGLETON = new DubleCheckSingleton();
                }
            }

        }
        return DUBLE_CHECK_SINGLETON;
    }

    /**
     * 防止序列化破坏单例
     * 在调用objectStream中的readObject时调用该方法
     * @return
     */
    private Object readResolve() {
        //返回单例对象
        return DUBLE_CHECK_SINGLETON;
    }
}