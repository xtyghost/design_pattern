/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: VideoFactory
 * Author:   xutong
 * Date:     2019-04-03 09:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.creational.simplefactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-03
 * @since 1.0.0
 */
public class VideoFactory {
    private static volatile Video video;
    public static  Video generateVideo(VideoTypeEnums type)  {
        try {
            return (Video) type.getAClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}