/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PageGroup
 * Author:   xutong
 * Date:     2020/10/31 10:54 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.commend;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public class CodeGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("新增一项代码");
    }

    @Override
    public void delete() {
        System.out.println("删除一项代码");
    }

    @Override
    public void change() {
        System.out.println("修改一项代码");
    }

    @Override
    public void plan() {
        System.out.println("代码变更计划");
    }
}