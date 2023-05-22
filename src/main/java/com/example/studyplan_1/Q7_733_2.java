package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

/**
 * [[2,2,2],[2,2,0],[2,0,1]]
 * @author xutong
 */
public class Q7_733_2 {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1; int sc = 1; int newColor = 2;
        int[][] ints = new Q7_733_2().floodFill(image,sr,sc,newColor);
        System.out.println(new JSONArray(ints));
    }
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if (currColor != color) {
            dfs(image, sr, sc, currColor, color);
        }
        return image;
    }

    public void dfs(int[][] image, int x, int y, int currColor, int color) {
        if (image[x][y] == currColor) {
            image[x][y] = color;
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
                    dfs(image, mx, my, currColor, color);
                }
            }
        }
    }


}
