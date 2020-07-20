package arrayAndString;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class SanSumTest {
    SanSum inst = new SanSum();
    @Test
    public void threeSum() {
        List<List<Integer>> ret = inst.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertThat(ret.size(), is(4));
    }
}