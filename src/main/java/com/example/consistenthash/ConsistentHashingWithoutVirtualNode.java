/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ConsistentHashingWithoutVirtualNode Author: xutong
 * Date: 2020/10/30 1:43 下午 Description: 实现一致性hash算法 History: <author> <time> <version> <desc> 作者姓名
 * 修改时间 版本号 描述
 */
package com.example.consistenthash;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈实现一致性hash算法〉
 *
 * @author xutong
 * @create 2020/10/30
 * @since 1.0.0
 */
public class ConsistentHashingWithoutVirtualNode {

  private static String[] servers = {"192.168.0.01:111", "192.168.1.7:111", "192.168.2.6:111"};
  private static SortedMap<Integer, String> sortedMap = new TreeMap<>();
  // 服务器初始化
  static {
    for (int i = 0; i < servers.length; i++) {
      int hash = getHash(servers[i]);
      System.out.println("[" + servers[i] + "]加入集合中，其Hash值为==" + hash);
      sortedMap.put(hash, servers[i]);
    }
  }

  private static String getServer(String key) {
    int hash = getHash(key);
    SortedMap<Integer, String> subMap = sortedMap.tailMap(hash);
    if (subMap.isEmpty()) {
      Integer i = sortedMap.firstKey();
      return sortedMap.get(i);
    } else {
      Integer i = subMap.firstKey();
      return subMap.get(i);
    }
  }
  // 使用FNV1_32_HASH算法
  private static int getHash(String str) {
    final int p = 16777619;
    int hash = (int) 2166136261L;
    for (int i = 0; i < str.length(); i++) hash = (hash ^ str.charAt(i)) * p;
    hash += hash << 13;
    hash ^= hash >> 7;
    hash += hash << 3;
    hash ^= hash >> 17;
    hash += hash << 5;

    // 如果算出来的值为负数则取其绝对值
    if (hash < 0) hash = Math.abs(hash);
    return hash;
  }
  public static void main(String[] args) {
    String[] keys = {"太阳", "月亮", "星星"};
    for(int i=0; i<keys.length; i++)
      System.out.println("[" + keys[i] + "]的hash值为" + getHash(keys[i])
              + ", 被路由到结点[" + getServer(keys[i]) + "]");
  }
}
