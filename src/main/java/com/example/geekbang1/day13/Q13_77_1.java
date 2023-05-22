package com.example.geekbang1.day13;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 * @author xutong
 */
public class Q13_77_1 {
    public static void main(String[] args) {
        int n =4,k= 2;
        System.out.println(new JSONArray(new Q13_77_1().combine(n,k)));
    }
    ArrayList<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> t = new ArrayList<>();
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        doCombine(n,1);
        return ans;
    }

    public void doCombine(int n,int index){
        if (t.size()==k){
            ans.add(new ArrayList<>(t));
            return;
        }
        if (n<index){
            return;
        }
        t.add(index);
        doCombine(n,index+1);
        t.remove(t.size()-1);
        doCombine(n,index+1);
    }
}
