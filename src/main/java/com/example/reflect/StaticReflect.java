/**
 * Copyright (C), 2015-2019, XXX有限公司 FileName: StaticReflect Author: xutong Date: 2019/12/25 3:06 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.reflect;

import java.lang.reflect.Field;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019/12/25
 * @since 1.0.0
 */
public class StaticReflect {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    //
    Class<StaticParamClass> staticReflectClass = StaticParamClass.class;
    Field name = staticReflectClass.getDeclaredField("name");
    name.setAccessible(true);
    name.set(StaticParamClass.class, "lisu");
    System.out.println(StaticParamClass.getName());
  }
}
