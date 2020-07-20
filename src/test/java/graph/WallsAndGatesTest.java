package graph;

import dynamicprom.WallsAndGates;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WallsAndGatesTest {
    WallsAndGates inst = new WallsAndGates();
    @Test
    public void wallsAndGates() {
        int[][] matrix = new int[][]{
                {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE}
                , {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1}
                , {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1}
                , {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}};
        inst.wallsAndGates(matrix);
        assertThat(matrix, is(new int[][]{
            {3,- 1, 0, 1}
            ,{2, 2,  1,  -1}
            ,{1,  -1,   2,  -1}
            ,{0,  -1,   3,   4}
        }));
    }
}