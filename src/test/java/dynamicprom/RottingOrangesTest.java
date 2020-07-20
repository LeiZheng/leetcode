package dynamicprom;

import org.junit.Test;
import sort.RotatedSortedArray;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RottingOrangesTest {
    RottingOranges inst = new RottingOranges();
    @Test
    public void orangesRotting() {
        int ret = inst.orangesRotting(new int[][]{
                {2, 1, 1}
                , {1, 1, 0}
                , {0, 1, 1}
        });
        assertThat(ret, is(4));
    }
}