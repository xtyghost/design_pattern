/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: VideoTypeEnums
 * Author:   xutong
 * Date:     2019-04-03 09:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.creational.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-03
 * @since 1.0.0
 */
@AllArgsConstructor
@Getter
public enum VideoTypeEnums {
    /**java*/
    JAVA(0, JavaVideo.class),
    /**js*/
    JS(1, JSVideo.class),
    /**python*/
    PYTHON(2, PythonVideo.class);
    private int code;
    private Class aClass;
}