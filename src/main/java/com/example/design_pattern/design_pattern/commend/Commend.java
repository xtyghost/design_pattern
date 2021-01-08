/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Commend Author: xutong Date: 2020/11/1 8:30 上午
 * Description: 命令类 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.commend;

/**
 * 〈一句话功能简述〉<br>
 * 〈命令类〉
 *把常用的操作封装成命令，方便用户使用，同时提供拓展抽象类，方法用户拓展方法
 * 使用场景，操作明确且有限的情况，逻辑复杂但是参与者明确的情况
 * commend命令
 * receiver 命令实际执行者（员工）---给用户更多更自由的权限，提高系统的可拓展性，但是降低了系统的稳定性，和封闭性
 * invoker 命令调用者（项目经理）
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public abstract class Commend {
  protected RequirementGroup requirementGroup = new RequirementGroup();
  protected PageGroup pageGroup = new PageGroup();
  protected CodeGroup codeGroup = new CodeGroup();

  public abstract void execute();
}
