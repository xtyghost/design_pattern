/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Group
 * Author:   xutong
 * Date:     2020/10/31 10:50 下午
 * Description: 抽象组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.commend;

import com.example.design_pattern.design_pattern.bridge.ABCBank;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象组〉
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public abstract class Group {

    public abstract void find();
    public abstract void add();
    public abstract void delete();
    public abstract void change();
    public abstract void plan();

}