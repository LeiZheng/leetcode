package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultiplyStringsTest {
    MultiplyStrings inst = new MultiplyStrings();
    @Test
    public void multiply() {
        String ret = inst.multiply("2", "3");
        assertThat(ret, is("6"));
    }
    @Test
    public void multiply2() {
        String ret = inst.multiply("123", "456");
        assertThat(ret, is("56088"));
    }

    @Test
    public void multiply3() {
        String ret = inst.multiply("999", "999");
        assertThat(ret, is("998001"));
    }
}