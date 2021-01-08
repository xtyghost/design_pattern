/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SubjectImpl
 * Author:   xutong
 * Date:     2020/11/1 10:21 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.observer.v2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class SubjectImpl extends Subject {
    public void doSomething(){
        this.notifyObservers();
    }
}