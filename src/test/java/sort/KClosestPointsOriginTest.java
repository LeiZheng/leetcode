package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KClosestPointsOriginTest {
    KClosestPointsOrigin inst = new KClosestPointsOrigin();
    @Test
    public void kClosest() {
        int[][] ret = inst.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        assertThat(ret, is(new int[][]{{3,3},{-2,4}}));
    }
}