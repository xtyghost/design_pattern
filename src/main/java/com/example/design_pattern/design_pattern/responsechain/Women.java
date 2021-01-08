/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Women Author: xutong Date: 2020/11/1 10:10 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.responsechain;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Women implements IWomen {
  /**
   * 1 -- 未出嫁
   * 2 -- 出嫁
   * 3 -- 夫死
   */
  private int type = 0;

  private String request = "";

  public Women(int type, String request) {
    this.type = type;
    this.request = request;
  }

  @Override
  public int getType() {
    return this.type;
  }

  @Override
  public String getRequest() {
    return this.request;
  }
}
