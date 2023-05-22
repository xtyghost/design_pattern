package com.example.geekbang1.day7;

import lombok.AllArgsConstructor;
import org.w3c.dom.css.Rect;

import java.util.Stack;

/**
 * 单调栈，解决方案
 * @author xutong
 */
public class Q7_84_3 {
    public static void main(String[] args) {
        System.out.println(new Q7_84_3().largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public int largestRectangleArea(int[] heights) {
        int[] ints1 = new int[heights.length + 1];
        System.arraycopy(heights,0,ints1,0,heights.length);
        ints1[heights.length]=0;

        int max =0;
        Stack<Rect> stack = new Stack<>();
        for (int i = 0; i < ints1.length; i++) {
            int accumulateWith =0;
            while (!stack.isEmpty()&&stack.peek().height>ints1[i]){
                Rect pop = stack.pop();
                accumulateWith+=pop.width;
                max = getMax(max,pop.height*accumulateWith);
            }
            stack.push(new Rect(accumulateWith+1,ints1[i]));
        }
        return max;
    }

    private int getMax(int max, int i) {
        return Math.max(max,i);
    }

    public static class Rect {
        public Rect(int width, int height) {
            this.width = width;
            this.height = height;
        }

        int width;
        int height;
    }


}
