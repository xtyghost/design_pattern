package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.*;

/**
 * LRU缓存
 */
public class Hot146 {
    public static void main(String[] args) {

    }

    class LRUCache {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        private int capacity = 0;

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {


            return hashMap.getOrDefault(key,-1);
        }

        public void put(int key, int value) {
            hashMap.put(key, value);
            if (hashMap.size() > capacity) {
                hashMap.remove(hashMap.keySet().iterator().next());
            }
        }
    }
}
