package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TopKFrequentElementsTest {
    TopKFrequentElements inst = new TopKFrequentElements();
    @Test
    public void topKFrequent() {
        int[] ret = inst.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertThat(ret, is(new int[]{1,2}));
    }
}