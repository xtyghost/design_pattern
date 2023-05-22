package com.example.top100;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 电话号码的字母组合
 */
public class Hot17 {
    String[][] strings = {{}, {}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"},};
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        for (int i = 0; i < digits.length(); i++) {
            int num = Integer.parseInt(digits.charAt(i) + "");
            String[] aChar = strings[num];
            if (list.isEmpty()) {
                for (String c : aChar) {
                    list.add("" + c);
                }
            } else {
                list = list.stream().flatMap(c -> Arrays.stream(aChar).map(a -> c + a)).collect(Collectors.toList());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new JSONArray(new Hot17().letterCombinations("23")));
    }
}
