package com.example.huawei;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 树形目录操作
 * @author xutong
 */
public class DeleteDir {
    public static void main(String[] args) {
        Node[] nodes = {
                new Node(3, 1),
                new Node(5, 1),
                new Node(4, 3),
                new Node(10, 5),
                new Node(11, 5),
                new Node(12, 4)
        };
        Map<Integer, List<Node>> map = Arrays.stream(nodes).collect(Collectors.groupingBy(Node::getParent));
        deleteDir(map,5);
        map.values().stream().flatMap(List::stream).forEach(node -> {
            System.out.println(node.getVal()+"    "+node.getParent());
        });
    }

    private static void deleteDir(Map<Integer, List<Node>> map, int i) {
        List<Node> removes = map.remove(i);
        if (removes ==null){
            return;
        }
        for (Node remove : removes) {
            deleteDir(map,remove.val);
        }
    }

    @Data
    public static class Node {
        int val;
        int parent;
        public Node(int val, int parent) {
            this.val = val;
            this.parent = parent;
        }
    }
}
