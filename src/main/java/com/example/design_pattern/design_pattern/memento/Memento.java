/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Memento
 * Author:   xutong
 * Date:     2020/11/2 6:53 上午
 * Description: 备忘录，记录对象的某一个状态，帮助对象恢复
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.memento;

/**
 * 〈一句话功能简述〉<br> 
 * 〈备忘录，记录对象的某一个状态，帮助对象恢复〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Memento {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}