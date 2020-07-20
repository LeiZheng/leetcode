package dynamicprom;

public class RottingOranges {
    int maxDeep = 0;
    public int orangesRotting(int[][] grid) {
        boolean moreRotting = true;
        while (moreRotting) {
            maxDeep ++;
            moreRotting = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 0) continue;
                    if (grid[i][j] == maxDeep + 1) {
                        moreRotting = setRotting(grid, i - 1, j) || moreRotting;
                        moreRotting = setRotting(grid, i + 1, j) || moreRotting;
                        moreRotting = setRotting(grid, i, j + 1) || moreRotting;
                        moreRotting = setRotting(grid, i, j - 1) || moreRotting;
                    }
                }
            }
         }


        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
                if(grid[i][j] == 1) return -1;
            }
        }

        return maxDeep - 1;
    }

    private boolean setRotting(int[][] grid, int i, int j) {
        if(i < 0 || i == grid.length) return false;
        if(j < 0 || j == grid[0].length) return false;
        if(grid[i][j] != 1) return false;
        grid[i][j] = maxDeep + 2;
        return true;
    }

}
