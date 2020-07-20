package dynamicprom;

public class WallsAndGates {
    public void wallsAndGates(int[][] rooms) {
        boolean hasMore = true;
        int step = 0;
        while (hasMore) {
            hasMore = false;
            for(int i = 0; i < rooms.length; i ++) {
                for(int j = 0; j < rooms[0].length; j ++) {
                    if(rooms[i][j] == step) {
                        hasMore = setStep(rooms, i + 1, j, step + 1) || hasMore;
                        hasMore = setStep(rooms, i - 1, j, step + 1) || hasMore;
                        hasMore = setStep(rooms, i, j + 1, step + 1) || hasMore;
                        hasMore = setStep(rooms, i, j - 1, step + 1) || hasMore;
                    }
                }
            }
            step ++;
        }
    }

    private boolean setStep(int[][] rooms, int i, int j, int step) {
        if(i < 0 || j < 0 || i == rooms.length || j == rooms[0].length) return false;
        if(rooms[i][j] == Integer.MAX_VALUE) {
            rooms[i][j] = step;
            return true;
        }
        else {
            return false;
        }
    }
}
