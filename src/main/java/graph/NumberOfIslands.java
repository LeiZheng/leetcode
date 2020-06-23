package graph;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int[][] flags = new int[grid.length][grid[0].length];
        int number = 0;
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
                if(flags[i][j] == 0 && grid[i][j] == '1') {
                   numIslandsRecursive(grid, i, j, flags);
                   number++;
                }
            }
        }
        return number;
    }

    private void numIslandsRecursive(char[][] grid, int i, int j, int[][] flags) {
        if(i == grid.length || i < 0) return;
        if(j == grid[0].length || j < 0) return;
        if(grid[i][j]=='0') return;
        if(flags[i][j] == 1) return;
        flags[i][j] = 1;
        numIslandsRecursive(grid, i + 1, j, flags);
        numIslandsRecursive(grid, i - 1, j, flags);
        numIslandsRecursive(grid, i , j + 1, flags);
        numIslandsRecursive(grid, i , j - 1, flags);
    }
}
