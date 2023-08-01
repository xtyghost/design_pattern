package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * 三数只和
 */
public class Hot200 {
    public static void main(String[] args) {
        Hot200 hot200 = new Hot200();
        char[][] grid = {
                {'1'}
        };
        System.out.println(JSONArray.toJSONString(hot200.numIslands(grid)));
    }

    public HashSet<Location> locations = new HashSet<>();
    private int sum = 0;
    private char[][] grid;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int y = 0; y < grid[0].length; y++) {
                if (grid[i][y] == '1' && locations.add(new Location(i, y))) {
                    sum++;
                    scanLand(i, y);
                }
            }
        }
        return sum;
    }

    private void scanLand(int x, int y) {
        Stream.of(new Location(x + 1, y), new Location(x - 1, y),
                        new Location(x, y + 1), new Location(x, y - 1)).filter(Location::isIllegal)
                .filter(location -> grid[location.x][location.y] == '1')
                .filter(location -> locations.add(location)).forEach(location -> scanLand(location.x, location.y));

    }

    public class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Location location = (Location) o;

            if (x != location.x) return false;
            return y == location.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        public boolean isIllegal() {
            return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
        }
    }

}
