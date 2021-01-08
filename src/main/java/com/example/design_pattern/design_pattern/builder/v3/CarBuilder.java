/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CarBuilder Author: xutong Date: 2020/10/30 3:37 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.builder.v3;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/30
 * @since 1.0.0
 */
public abstract class CarBuilder {
  public abstract void setSequence(ArrayList<String> sequence);

  public abstract CarModel getCarModel();
}
