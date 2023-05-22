/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StaticSingleton
 * Author:   xutong
 * Date:     2019-04-09 10:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.dependenceinversion;

/**
 * 〈单例静态内部类〉<br>
 * 〈基于类初始化的延迟加载解决方案〉
 *
 *
 * @author xutong
 * @create 2019-04-09
 * @since 1.0.0
 */
public class StaticSingleton {
    private StaticSingleton() {
      if (StaticSingletonHolder.staticSingleton!=null){
          throw new RuntimeException("单例构造器禁止反射调用");
      }
    }

    private static class StaticSingletonHolder {
        public static StaticSingleton staticSingleton=new StaticSingleton();
    }

    /**
     * 利用内部类和外部类没有绑定关系，编译时会出现两个类
     * 内部类的静态变量只有在被第一次调用是才会被加载（延迟加载）
     * @return
     */
    public static StaticSingleton getStaticSingleton(){
        return StaticSingletonHolder.staticSingleton;
    }


}