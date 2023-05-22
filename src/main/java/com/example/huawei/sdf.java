package com.example.huawei;

import cn.hutool.core.collection.CollectionUtil;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author xutong
 */
public class sdf {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());

        HashSet<Integer> set = new HashSet<>();
        for(String s : split){
            set.add(Integer.parseInt(s));
        }

        if(set.size() < 2 * n){
            System.out.println(-1);
            return ;
        }

        int sum = 0;
        List<Integer> sort = CollectionUtil.sort(set, Integer::compareTo);
        Integer[] ints = new Integer[sort.size()];
        sort.toArray(ints);
        for(int i = 0; i < n; i++){
            sum += ints[i] + ints[sort.size() - 1 - i];
        }
//        for (Integer integer : sort) {
//            System.out.println(integer);
//        }
        System.out.println(sum);
    }
}
