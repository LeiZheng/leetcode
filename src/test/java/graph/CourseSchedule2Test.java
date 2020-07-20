package graph;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CourseSchedule2Test {
    CourseSchedule2 inst = new CourseSchedule2();
    @Test
    public void findOrder() {
        int[] ret = inst.findOrder3(2, new int[][]{});
        assertThat(ret, is(new int[]{0, 1}));
    }
    @Test
    public void findOrder2() {
        int[] ret = inst.findOrder3(2, new int[][]{{1,0},{0, 1}});
        assertThat(ret, is(new int[]{}));
    }
    @Test
    public void findOrder3() {
        int[] ret = inst.findOrder3(3, new int[][]{{0,1},{0, 2},{1,2}});
        assertThat(ret, is(new int[]{2,1,0}));
    }
}