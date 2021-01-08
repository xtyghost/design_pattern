/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AudioPlayer Author: xutong Date: 2020/11/1 3:58 下午
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
public class AudioPlayer implements MediaPlayer {

  @Override
  public void play(String audioType, String fileName) throws Exception {
    if ("mp3".equalsIgnoreCase(audioType)) {
      System.out.println("playmp3===" + fileName);
    } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
      new MediaAdapter().play(audioType, fileName);
    } else {
      throw new Exception("该中格式对音乐暂时不支持，敬请期待！！");
    }
  }
}
