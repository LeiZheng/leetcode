package graph;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IslandPerimeterTest {
    IslandPerimeter inst = new IslandPerimeter();
    @Test
    public void islandPerimeter() {
        int ret = inst.islandPerimeter(new int[][]{
                {0, 1, 0, 0}
                , {1, 1, 1, 0}
                , {0, 1, 0, 0}
                , {1, 1, 0, 0}
        });
        assertThat(ret, is(16));
    }
}