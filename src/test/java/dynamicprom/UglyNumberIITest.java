package dynamicprom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UglyNumberIITest {
    UglyNumberII inst = new UglyNumberII();
    @Test
    public void nthUglyNumber() {
        int ret = inst.nthUglyNumber(10);
        assertThat(ret, is(12));
    }
}