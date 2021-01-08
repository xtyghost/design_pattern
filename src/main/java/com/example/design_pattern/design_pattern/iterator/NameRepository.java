/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: NameRepository Author: xutong Date: 2020/11/1 4:17 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.iterator;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class NameRepository implements Container {
  public String names[] = {"lisu", "wangwu", "zhaoliu"};

  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }

  private class NameIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext() {
      return index < names.length;
    }

    @Override
    public Object next() {
      return names[index++];
    }
  }
}
