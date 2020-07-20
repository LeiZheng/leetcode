package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PlusOneTest {
    PlusOne inst = new PlusOne();
    @Test
    public void plusOne() {
        int[] ret = inst.plusOne(new int[]{1, 2, 3});
        assertThat(ret, is(new int[]{1,2,4}));
    }
}