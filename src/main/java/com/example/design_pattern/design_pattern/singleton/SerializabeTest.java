/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: SerializabeTest Author: xutong Date: 2020/10/21 9:27
 * 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.singleton;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/21
 * @since 1.0.0
 */
public class SerializabeTest {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    //
    DoubleCheckSingleTon instance = DoubleCheckSingleTon.getInstance();
    new ObjectOutputStream(new FileOutputStream(new File("/Users/xutong/Desktop/design_pattern/src/main/java/com/example/design_pattern/design_pattern/singleton/DoubleCheckSingleTon.text"))).writeObject(instance);
    DoubleCheckSingleTon serializable = (DoubleCheckSingleTon) new ObjectInputStream(new FileInputStream(new File("/Users/xutong/Desktop/design_pattern/src/main/java/com/example/design_pattern/design_pattern/singleton/DoubleCheckSingleTon.text"))).readObject();
  }
}
