/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HungrySingleton
 * Author:   xutong
 * Date:     2019-04-09 11:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.dependenceinversion;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-09
 * @since 1.0.0
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {
        if (HUNGRY_SINGLETON!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    private static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}