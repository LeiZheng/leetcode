package graph;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CourseScheduleTest {
    CourseSchedule inst = new CourseSchedule();
    @Test
    public void canFinish1() {
        boolean canFinish = inst.canFinish(2, new int[][]{{1, 0}});
        assertThat(canFinish, is(true));
    }
    @Test
    public void canFinish2() {
        boolean canFinish = inst.canFinish(2, new int[][]{{1, 0},{0, 1}});
        assertThat(canFinish, is(false));
    }

}