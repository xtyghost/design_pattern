/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AddRequirementConmmand
 * Author:   xutong
 * Date:     2020/11/1 8:32 上午
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
public class AddRequirementCommand extends Commend {

    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}