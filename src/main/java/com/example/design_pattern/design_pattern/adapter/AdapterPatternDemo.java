/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: sdf
 * Author:   xutong
 * Date:     2020/11/1 4:01 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.adapter;

/**
 * 〈一句话功能简述〉<br> 
 * 〈适配器模式，让两种不兼容对对象一起工作，把功能复杂化--一般在代码维护时使用〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class AdapterPatternDemo {
    public static void main(String[] args) throws Exception {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}