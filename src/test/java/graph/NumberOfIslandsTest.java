package graph;

import graph.NumberOfIslands;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    NumberOfIslands inst = new NumberOfIslands();
    @Test
    public void numIslands() {
        int numOfIsland = inst.numIslands(new char[][]{
                {'1','0','0','0'}
                , {'1','0','0','0'}
                , {'0','0','1','0','0'}
                , {'0','0','0','1','1'}
        });
        assertThat(numOfIsland, is(3));
    }

}