package com.example.studyplan_1;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xutong
 */
public class Q7_695_2 {
    public static void main(String[] args) {

    int[][] grid =      {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};


        System.out.println(new Q7_695_2().maxAreaOfIsland(grid));
    }

    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[0].length; i1++) {
                AtomicInteger integer = new AtomicInteger(0);
                wfs(grid,i,i1, integer);
               if (max<integer.intValue()){
                   max = integer.intValue();
               }
            }
        }
        return max;
    }
    int[] dx ={-1,0,0,1};
    int[] dy ={0,1,-1,0};


    private  void wfs(int[][] grid, int i, int i1, AtomicInteger count) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i,i1});
        while (!stack.isEmpty()){
            int[] pop = stack.pop();
            if (grid[pop[0]][pop[1]] ==1){
                grid[pop[0]][pop[1]]=2;
                count.incrementAndGet();
                for (int j = 0; j < 4; j++) {
                    int mx = pop[0]+dx[j];
                    int my = pop[1]+dy[j];
                    if (mx>=0&&mx<grid.length&&my>=0&&grid[0].length>my&&grid[mx][my]==1){
                        stack.push(new int[]{mx,my});
                    }
                }
            }
        }
    }
}
