/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DoubleCheckSingleTon Author: xutong Date: 2020/10/21
 * 9:22 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.singleton;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈双次检查锁的单例模式〉
 *
 * @author xutong
 * @create 2020/10/21
 * @since 1.0.0
 */
public class DoubleCheckSingleTon implements Serializable {
  private static volatile DoubleCheckSingleTon singleTon;

  private DoubleCheckSingleTon() {}

  public static DoubleCheckSingleTon getInstance() {
    if (singleTon == null) {
      synchronized (DoubleCheckSingleTon.class) {
        if (singleTon == null) {
          singleTon = new DoubleCheckSingleTon();
        }
      }
    }
    return singleTon;
  }

  public Object readResolve() throws IllegalAccessException {
    throw new IllegalAccessException("不可以通过序列化生");
  }
}
