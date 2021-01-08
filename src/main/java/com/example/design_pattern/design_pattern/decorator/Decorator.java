/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Decorator
 * Author:   xutong
 * Date:     2020/11/1 10:53 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.decorator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public abstract class Decorator extends Component {

     private Component component;

    public Component getComponent() {
        return component;
    }

    public Decorator() {
    }

    public Decorator(Component component) {
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }


    @Override
    public void operate() {
         this.component.operate();
    }
}