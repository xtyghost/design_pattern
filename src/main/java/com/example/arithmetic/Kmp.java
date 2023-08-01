package com.example.arithmetic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;

public class Kmp {


    public static void main(String[] args) {
        System.out.println(new Kmp().match("ABCDABD", "ABCDABD"));
    }

    HashMap<String, Integer> coincidenceMap = new HashMap<>();
    Function<String, Integer> coincideLengthFunction = c -> {
        Integer v = coincidenceMap.get(c);
        if (v == null) {
            HashSet<String> prefixSet = new HashSet<>();
            HashSet<String> suffixSet = new HashSet<>();
            for (int i = 1; i < c.length(); i++) {
                prefixSet.add(c.substring(0, i));
                suffixSet.add(c.substring(i));
            }
            prefixSet.retainAll(suffixSet);
            v = prefixSet.stream().map(String::length).max(Integer::compareTo).orElse(0);
            coincidenceMap.put(c, v);
        }
        return v;
    };

    public boolean match(String origin, String target) {
        int indexT = 0;

        for (int i = 0; i < origin.length(); i++) {
            if (target.length() - indexT > origin.length() - i) {
                return false;
            }
            if (origin.charAt(i) == target.charAt(indexT)) {
                indexT++;
                if (target.length() == indexT) {
                    return true;
                }
                continue;
            }
            if (indexT != 0) {
                indexT = coincideLengthFunction.apply(target.substring(0, indexT));
                i--;
            }
        }
        return false;
    }
}
