package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.*;
import java.util.stream.Collectors;

public class Hot49_1 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Hot49_1 hot491 = new Hot49_1();
        System.out.println(JSONArray.toJSONString(hot491.groupAnagrams(strs)));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> cacheMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            List<String> orDefault = cacheMap.getOrDefault(new String(charArray), new ArrayList<>());
            orDefault.add(str);
            cacheMap.put(new String(charArray), orDefault);
        }
        return new ArrayList<>(cacheMap.values());
    }
}
