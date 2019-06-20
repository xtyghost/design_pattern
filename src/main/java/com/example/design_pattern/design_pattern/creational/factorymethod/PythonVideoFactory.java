/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PythonVideoFactory
 * Author:   xutong
 * Date:     2019-04-03 10:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.creational.factorymethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-03
 * @since 1.0.0
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video generateVideo() {
        return new PythonVideo();
    }
}