/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AbstractColleague
 * Author:   xutong
 * Date:     2020/10/31 10:40 下午
 * Description: 抽象同事类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.mediator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象同事类〉
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}