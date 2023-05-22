package com.example.studyplan_1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xutong
 */
public class Q7_695 {
    public static void main(String[] args) {

    int[][] grid =      {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};


        System.out.println(new Q7_695().maxAreaOfIsland(grid));
    }

    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[0].length; i1++) {
                AtomicInteger integer = new AtomicInteger(0);
                dfs(grid,i,i1, integer);
               if (max<integer.intValue()){
                   max = integer.intValue();
               }
            }
        }
        return max;
    }
    int[] dx ={-1,0,0,1};
    int[] dy ={0,1,-1,0};


    private  void dfs(int[][] grid, int i, int i1, AtomicInteger count) {
        if (grid[i][i1]==1){
            grid[i][i1]=2;
            count.incrementAndGet();
            for (int j = 0; j < 4; j++) {
                int mx = i+dx[j];
                int my = i1+dy[j];
                if (mx>=0&&mx<grid.length&&my>=0&&grid[0].length>my&&grid[mx][my]==1){
                    dfs(grid,mx,my,count);
                }
            }
        }
    }
}
