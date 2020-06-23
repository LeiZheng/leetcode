package graph;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CutOffTreesTest {
    CutOffTrees inst = new CutOffTrees();
    @Test
    public void cutOffTree() {
        int steps = inst.cutOffTree(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(0, 0, 4),
                Arrays.asList(7, 6, 5)
        ));
        assertThat(steps, is(6));
    }
}