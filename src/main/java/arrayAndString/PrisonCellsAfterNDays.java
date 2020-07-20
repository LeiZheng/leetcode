package arrayAndString;

public class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        for(int day = 0; day < N; day ++) {
            int preVal = 0;
            for( int i = 0; i < cells.length; i ++) {
                int currVal = cells[i];
                if( i == 0 || i == cells.length - 1) {
                    cells[i] = 0;
                }
                else {
                    cells[i] = preVal == cells[i + 1] ? 1 : 0;
                }
                preVal = currVal;
            }
        }
        return  cells;
    }
}
