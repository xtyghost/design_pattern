package com.example.geekbang1.day7;

import cn.hutool.json.JSONArray;

import java.util.LinkedList;


/**
 * 滑动窗口最大值
 * @author xutong
 */
public class Q7_239_1 {
    public static void main(String[] args) throws Exception {
       int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
       int k = 3;
       int[] ints = new Q7_239_1().maxSlidingWindow(nums,k);
       System.out.println(new JSONArray(ints));
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k+1];
        LinkedList<Node> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
                while (!list.isEmpty()&&list.getFirst().getIndex()<=i-k){
                    list.removeFirst();
                }
                while (!list.isEmpty()&&list.getLast().getVal()<=nums[i]){
                    list.removeLast();
                }
                list.addLast(new Node(i,nums[i]));
                if (i-k+1>=0){
                    result[i-k+1]=list.peekFirst().getVal();
                }
        }
        return result;
    }
    public static class  Node{
        public Node(int index, int val) {
            this.index = index;
            this.val = val;
        }

        private int index;
        private int val;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

}
