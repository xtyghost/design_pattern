/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: State
 * Author:   xutong
 * Date:     2020/11/2 7:26 上午
 * Description: 抽象环境类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.state;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象环境类〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public abstract class State {
    protected Context context;

    public abstract void handle1();
    public abstract void handle2();
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}