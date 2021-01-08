/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CommonEmployee Author: xutong Date: 2020/11/2 7:04 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.visitor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class CommonEmployee extends AbstractEmployee {
  private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
  }
}
