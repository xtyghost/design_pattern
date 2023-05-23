package com.example.top100;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 最长连续序列
 */
public class Hot_128_2 {

    public static void main(String[] args) {
        Hot_128_2 hot_128_2 = new Hot_128_2();
        int[] nums1 = {100, 4, 200, 1, 3, 2};

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7};
//        Assert.isTrue(hot_128_2.longestConsecutive(nums1) == 4, "error");
//        Assert.isTrue(hot_128_2.longestConsecutive(nums2) == 9, "error");
        Assert.isTrue(hot_128_2.longestConsecutive(nums3) == 4, "error");

    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Node> map = new HashMap<>();
        for (int num : set) {
            Node node = new Node(num, num);
            Node l = map.getOrDefault(num - 1, node);
            Node r = map.getOrDefault(num + 1, node);
            node.head = l.head;
            node.tail = r.tail;
            map.remove(num - 1);
            map.remove(num + 1);
            map.put(node.head, node);
            map.put(node.tail, node);
            if (node.getLength() > max) {
                max = node.getLength();
            }
        }
        return max;
    }

    public class Node {
        public Node(int head, int tail) {
            this.head = head;
            this.tail = tail;
        }

        int head;
        int tail;

        public int getLength() {
            return tail - head + 1;
        }
    }


}
