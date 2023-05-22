package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xutong
 */
public class Q7_733 {
    public static void main(String[] args) {
       int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
       int sr = 1; int sc = 1; int newColor = 2;
        int[][] ints = new Q7_733().floodFill(image,sr,sc,newColor);
        System.out.println(new JSONArray(ints));
    }
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if (currColor == color) {
            return image;
        }
        int n = image.length, m = image[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = color;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = color;
                }
            }
        }
        return image;
    }


}
