package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TwoSumIITest {
    TwoSumII inst = new TwoSumII();
    @Test
    public void twoSum() {
        int[] ret = inst.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertThat(ret, is(new int[]{1,2}));
    }
}