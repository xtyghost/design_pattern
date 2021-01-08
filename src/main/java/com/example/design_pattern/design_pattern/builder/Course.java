/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Course
 * Author:   xutong
 * Date:     2019-04-08 10:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-08
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;


}