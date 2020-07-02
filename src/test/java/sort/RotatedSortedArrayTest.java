package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RotatedSortedArrayTest {
    RotatedSortedArray inst = new RotatedSortedArray();
    @Test
    public void search() {
        int ret = inst.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        assertThat(ret, is(4));
    }
}