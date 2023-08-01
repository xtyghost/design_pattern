package com.example.top100;

import java.util.LinkedList;
import java.util.stream.Stream;

public class Hot994 {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(new Hot994().orangesRotting(arr));
    }

    int orangesSum = 0;
    int bedOrangesSum = 0;
    int[][] originGrid;
    int maxRound = 0;
    LinkedList<OrangeNode> nodes = new LinkedList<>();

    public int orangesRotting(int[][] grid) {
        originGrid = grid;

        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[0].length; i1++) {
                if (grid[i][i1] == 2) {
                    nodes.add(new OrangeNode(i, i1, 0));
                    bedOrangesSum++;
                    orangesSum++;
                }
                if (grid[i][i1] == 1) {
                    orangesSum++;
                }
            }
        }
        while (nodes.peek() != null) {
            dfsSpread(nodes.pop());
        }
        if (orangesSum > bedOrangesSum) {
            return -1;
        }
        return maxRound;
    }

    public void dfsSpread(OrangeNode orangeNode) {
        maxRound = Math.max(maxRound, orangeNode.round);
        Stream.of(orangeNode.spreadLeft(), orangeNode.spreadRight(), orangeNode.spreadUp(),
                orangeNode.spreadDown()).filter(node -> node.canSpread(originGrid)).forEach(node -> {
            originGrid[node.x][node.y] = 2;
            bedOrangesSum++;
            nodes.add(node);
        });
    }

    public static class OrangeNode {

        public OrangeNode(int x, int y, int round) {
            this.x = x;
            this.y = y;
            this.round = round;
        }

        public int x;
        public int y;
        public int round;

        public OrangeNode spreadLeft() {
            return new OrangeNode(x - 1, y, round + 1);

        }

        public OrangeNode spreadRight() {
            return new OrangeNode(x + 1, y, round + 1);

        }

        public OrangeNode spreadDown() {
            return new OrangeNode(x, y - 1, round + 1);
        }

        public OrangeNode spreadUp() {
            return new OrangeNode(x, y + 1, round + 1);
        }

        public boolean canSpread(int[][] grid) {
            if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
                return false;
            }
            return grid[x][y] == 1;
        }
    }
}
