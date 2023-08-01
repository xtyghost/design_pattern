package com.example.top100;

import java.util.*;
import java.util.stream.Collectors;

public class Hot207 {
    public static void main(String[] args) {
        System.out.println(new Hot207().canFinish(3, new int[][]{{2, 1}, {2, 0}}));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> reverseMap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < prerequisites.length; i++) {
            int key = prerequisites[i][0];
            int value = prerequisites[i][1];
            HashSet<Integer> orDefault = map.getOrDefault(key, new HashSet<>());
            orDefault.add(value);
            map.put(key, orDefault);

            HashSet<Integer> rDefault = reverseMap.getOrDefault(value, new HashSet<>());
            rDefault.add(key);
            reverseMap.put(value, rDefault);
            set.add(key);
            set.add(value);
        }
        numCourses = set.size();

        HashSet<Integer> isolatedCourse = new HashSet<>(reverseMap.keySet());
        isolatedCourse.removeAll(map.keySet());
        while (isolatedCourse.size() <= numCourses) {
            if (isolatedCourse.size() == numCourses) {
                return true;
            }
            Set<Integer> newCourses = map.entrySet().stream()
                    .filter(entry -> isolatedCourse.containsAll(entry.getValue()))
                    .map(Map.Entry::getKey).collect(Collectors.toSet());
            if (isolatedCourse.containsAll(newCourses)) {
                return false;
            }
            isolatedCourse.addAll(newCourses);
        }
        return true;
    }
}
