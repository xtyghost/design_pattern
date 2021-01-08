/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DeletePageCommand
 * Author:   xutong
 * Date:     2020/11/1 8:33 上午
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
 * @create 2020/11/1
 * @since 1.0.0
 */
public class DeletePageCommand extends Commend {

    @Override
    public void execute() {
        this.pageGroup.find();
        this.pageGroup.delete();
        this.pageGroup.plan();
    }
}