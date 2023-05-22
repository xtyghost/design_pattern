package com.example.geekbang1.day7;

import java.util.Stack;

/**
 * 接雨水
 * 单调栈
 * @author xutong
 */
public class Q7_42_1 {
    public static void main(String[] args) {
        System.out.println(new Q7_42_1().trap(new int[]{4,2,0,3,2,5}));
    }
    public int trap(int[] arr) {
        Stack<Node> leftStack = new Stack<>();
        Stack<Node> rightStack = new Stack<>();
        int max=0;
        max = getMax(arr, max);
        int left = getLeft(arr, leftStack, max);
        int right = getRight(arr, rightStack, max);
        int sum =(right-left)*max+max;
        while (!leftStack.isEmpty()) {
            Node pop = leftStack.pop();
            sum= sum+ pop.height*pop.width;
        }
        while (!rightStack.isEmpty()) {
            Node pop = rightStack.pop();
            sum= sum+ pop.height*pop.width;
        }
        for (int i : arr) {
            sum -=i;
        }
        return  sum;
    }

    private int getLeft(int[] arr, Stack<Node> stack, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== max){
               return i;
            }
            if (!stack.isEmpty()&& stack.peek().height>= arr[i]){
                Node peek = stack.peek();
                peek.width= peek.width+1;
            }else {
                stack.push(new Node(1, arr[i]));
            }
        }
        return 0;
    }
    private int getRight(int[] arr, Stack<Node> stack, int max) {
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]== max){
                return i;
            }
            if (!stack.isEmpty()&& stack.peek().height>= arr[i]){
                Node peek = stack.peek();
                peek.width= peek.width+1;
            }else {
                stack.push(new Node(1, arr[i]));
            }
        }
        return arr.length-1;
    }

    private int getMax(int[] arr, int max) {
        for (int i : arr) {
            if (i> max){
                max = i;
            }
        }
        return max;
    }

    public static class Node{
        public Node(int width, int height) {
            this.width = width;
            this.height = height;
        }

        int width;
        int height;
    }


}
