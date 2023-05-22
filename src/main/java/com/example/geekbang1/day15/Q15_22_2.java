package com.example.geekbang1.day15;

import cn.hutool.json.JSONArray;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 括号生成
 * ["()"]
 *["()()","(())"]
 * ["()()()","()(())","(())()","(()())","((()))"]
 * @author xutong
 */
public class Q15_22_2 {
    public static void main(String[] args) {
        System.out.println(new JSONArray(new Q15_22_2().generateParenthesis(2)));
    }

        ArrayList[] cache = new ArrayList[100];

        public List<String> generate(int n) {
            if (cache[n] != null) {
                return cache[n];
            }
            ArrayList<String> ans = new ArrayList<String>();
            if (n == 0) {
                ans.add("");
            } else {
                for (int c = 0; c < n; ++c) {
                    for (String left: generate(c)) {
                        for (String right: generate(n - 1 - c)) {
                            ans.add("(" + left + ")" + right);
                        }
                    }
                }
            }
            cache[n] = ans;
            return ans;
        }

        public List<String> generateParenthesis(int n) {
            return generate(n);
        }

}
