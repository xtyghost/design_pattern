/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: VlcPlayer Author: xutong Date: 2020/11/1 3:48 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.adapter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Mp4Player implements AdvancedMediaMp4Player {

  @Override
  public void playMp4(String fileName) {
    System.out.println("playMp4===="+fileName);
  }
}
