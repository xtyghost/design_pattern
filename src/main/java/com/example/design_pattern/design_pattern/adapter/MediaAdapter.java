/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MediaAdapter Author: xutong Date: 2020/11/1 3:53 下午
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
public class MediaAdapter implements MediaPlayer {
  private AdvancedMediaMp4Player advancedMediaMp4Player = new Mp4Player();
  private AdvancedMediaVlcPlayer advancedMediaVlcPlayer = new VlcPlayer();

  public MediaAdapter() {

  }

  public AdvancedMediaMp4Player getAdvancedMediaMp4Player() {
    return advancedMediaMp4Player;
  }

  public void setAdvancedMediaMp4Player(AdvancedMediaMp4Player advancedMediaMp4Player) {
    this.advancedMediaMp4Player = advancedMediaMp4Player;
  }

  public AdvancedMediaVlcPlayer getAdvancedMediaVlcPlayer() {
    return advancedMediaVlcPlayer;
  }

  public void setAdvancedMediaVlcPlayer(AdvancedMediaVlcPlayer advancedMediaVlcPlayer) {
    this.advancedMediaVlcPlayer = advancedMediaVlcPlayer;
  }

  @Override
  public void play(String audioType, String fileName) throws Exception {
    if ("vlc".equalsIgnoreCase(audioType)) {
      advancedMediaVlcPlayer.playVlc(fileName);
    } else if ("mp4".equalsIgnoreCase(audioType)) {
      advancedMediaMp4Player.playMp4(fileName);
    } else {
      throw new Exception("该中格式对音乐暂时不支持，敬请期待！！");
    }
  }
}
